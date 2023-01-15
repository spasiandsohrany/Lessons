package MailSystem;

public interface MailService {
    Sendable processMail(Sendable mail) throws StolenPackageException;
}
