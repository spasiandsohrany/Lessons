package MailSystem;

public class Thief implements  MailService{
    private int minValue = 0;
    private int stolenValue = 0;

    public Thief(int minValue) {
        this.minValue = minValue;
    }

    public int getStolenValue() {
        return stolenValue;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail.getClass() == MailPackage.class) {
            Package pac = ((MailPackage) mail).getContent();
            if (pac.getPrice() >= minValue) {
                stolenValue += pac.getPrice();
                mail = new MailPackage(mail.getFrom(), mail.getTo(), new Package("stones instead of" + pac.getContent(), 0));
            }
        }
        return mail;
    }
}
