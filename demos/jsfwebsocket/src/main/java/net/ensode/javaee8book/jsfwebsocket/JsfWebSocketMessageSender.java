package net.ensode.javaee8book.jsfwebsocket;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.push.Push;
import javax.faces.push.PushContext;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ApplicationScoped
public class JsfWebSocketMessageSender implements Serializable {

    private List<String> channels;
    private String newChannel;


    // TODO: implement dynamic channels instead of this hardcoded channel "pushContext"
    // Either find a way to use a factory or ServiceLocator... not sure is it possible at all,
    // the universal solution would be using websocket endpoints
    @Inject
    @Push
    private PushContext pushContext;

    public void send(String message) {
        System.out.println("Sending message: " + message);
        pushContext.send(message);
    }

    @PostConstruct
    public void init() {
        channels = new ArrayList<String>();
        channels.add("general-chit-chat");
    }

    public void addChannel() {
        if (newChannel != null && !newChannel.trim().isEmpty() && !channels.contains(newChannel)) {
            channels.add(newChannel);
        }
        newChannel = null; // Clear input
    }

    public String getNewChannel() {
        return newChannel;
    }
    public void setNewChannel(String newChannel) {
        this.newChannel = newChannel;
    }

    public List<String> getChannels() {
        return channels;
    }

    public void setChannels(List<String> channels) {
        this.channels = channels;
    }


    public void refreshChannels() {
        // Logic to refresh channels, currently not needed
    }




}
