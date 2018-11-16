
public class Mail {

    private String sender;
    private String recipient;
    private String subject;
    private String mailBody;
    private String mailID;
    private String timeDate;
    private boolean isUnread = true;

    public String getSender() {return sender;}
    public String getRecipient() {return recipient;}
    public String getSubject() {return subject;}
    public String getMailBody() {return mailBody;}
    public String getMailID() {return mailID;}
    public String getTimeDate() {return timeDate;}
    public boolean getIsUnread() {return isUnread;}

    public void setMailID(String id){this.mailID = id;}
    public void mailRead(){this.isUnread = false;}

}
