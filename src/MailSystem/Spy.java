package MailSystem;

import java.util.logging.*;

import static MailSystem.Main.AUSTIN_POWERS;

public class Spy implements MailService {
    private final Logger logger;

    public Spy(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail.getClass() == MailMessage.class) {
            MailMessage mailMessage = (MailMessage) mail;
            String from = mailMessage.getFrom();
            String to = mailMessage.getTo();
            if (from.equals(AUSTIN_POWERS) || to.equals(AUSTIN_POWERS)) {
                logger.log(Level.WARNING, "Detected target mail correspondence: from" + from + "to" + mailMessage.getMessage());
            } else {
                logger.log(Level.INFO, "Usual correspondence: from" + from + "to" + to + "");
            }
        }
        return mail;
    }
}
/*
    final Logger logger = Logger.getLogger("com.javamentor.logging.Test");
	logger.log(Level.INFO, "Все хорошо");
            logger.log(Level.WARNING, "Произошла ошибка");

 */
