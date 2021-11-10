package day44.sub;

import day44.SlackUser;

public class SlackAdminUser extends SlackUser {

//    protected String name ;
//    protected String status ;

    int adminId ;

    public SlackAdminUser(String name, String status, int adminId) {
        this.adminId = adminId;
        this.name = name ;
        this.status = status ;
    }

    public static void main(String[] args) {

        SlackAdminUser user1 = new SlackAdminUser("Akbar","Release your horses", 101) ;
        // --- inherited methods we are calling
        user1.sendMessage();
        user1.callSomeone();
        user1.addEmoji();
        // --- our own methods we are calling
        user1.addChannel() ;
        user1.deleteMessage();
        user1.sendAtChannelMessage();

        System.out.println("user1 = " + user1);


    }


    public String toString() {
        return "SlackAdminUser{" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", adminId=" + adminId +
                '}';
    }
    public void sendAtChannelMessage(){

        System.out.println(name+" sending channel message");
    }

    public void deleteMessage(){

        System.out.println(name+" deleting slack messages");
    }

    public void addChannel(){

        System.out.println(name+" adding new channels");
    }

    // sendAtChannelMessage
    // deleteMessage
    // addChannel
    //
    //  toString method






}