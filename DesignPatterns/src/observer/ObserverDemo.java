package observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverDemo {

    public static void main(String[] args) {

        TwitterStream messageStream = new TwitterStream();
        FacebookStream facebookStream = new FacebookStream();
        NatGeoStream natGeoStream = new NatGeoStream();

        TwitterClient twitterClient1 = new TwitterClient("Andra");
        TwitterClient twitterClient2 = new TwitterClient("Razvan");

        messageStream.addObserver(twitterClient1);
        messageStream.addObserver(twitterClient2);

        messageStream.deleteObserver(twitterClient2);

        messageStream.someoneTweeted();

        FacebookClient facebookClient1 = new FacebookClient("Ana");
        facebookStream.addObserver(facebookClient1);
        facebookStream.someonePosted();

        NatGeoClient natGeoClient = new NatGeoClient("Radu");
        natGeoStream.addObserver(natGeoClient);
        natGeoStream.publishNewArticle();
    }
}

//concrete subject
class TwitterStream extends Observable {

    public void someoneTweeted() {
        setChanged();
        notifyObservers();
    }
}

class FacebookStream extends Observable {

    public void someonePosted() {
        setChanged();
        notifyObservers();
    }
}

class NatGeoStream extends Observable {

    public void publishNewArticle() {
        setChanged();
        notifyObservers();
    }
}

//concrete observer
class TwitterClient implements Observer {

    public String name;

    public TwitterClient(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Update " + name + "'s stream, someone tweeted something.");
    }
}

//concrete observer
class FacebookClient implements Observer {

    public String name;

    public FacebookClient(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Update " + name + "'s stream, someone posted something on the wall.");
    }
}

//concrete observer
class NatGeoClient implements Observer {

    public String username;

    public NatGeoClient(String username) {
        this.username = username;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Update " + username + "'s stream, NatGeo released a new article");
    }
}







