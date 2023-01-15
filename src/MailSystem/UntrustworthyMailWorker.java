package MailSystem;

public class UntrustworthyMailWorker implements MailService {
    private final RealMailService realMailService = new RealMailService();
    private MailService[] mailServices;

    public UntrustworthyMailWorker(MailService[] services) {
        mailServices = services;
    }

    public MailService getRealMailService() {
        return realMailService;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        Sendable processed = mail;
        for (int i = 0; i < mailServices.length; i++) {
            processed = mailServices[i].processMail(processed);
        }
        return realMailService.processMail(mail);
    }
}
