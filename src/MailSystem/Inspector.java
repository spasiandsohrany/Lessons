package MailSystem;

import static MailSystem.Main.WEAPONS;
import static MailSystem.Main.BANNED_SUBSTANCE;

public class Inspector implements MailService {

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail.getClass() == MailPackage.class) {
            Package pac = ((MailPackage) mail).getContent();
            String content = pac.getContent();
            if (content.indexOf("stones instead of") == 0) {
                throw new StolenPackageException();
            } else if (content.contains("weapons") || content.equals(BANNED_SUBSTANCE)) {
                throw new IllegalPackageException();
            }
        }
        return mail;
    }
}
