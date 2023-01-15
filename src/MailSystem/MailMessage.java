package MailSystem;

import java.util.Objects;

public class MailMessage extends AbstractSendable {
    private  final String message;

    protected MailMessage(String from, String to, String message) {
        super(from, to);
        this.message = message;
    }

    public String getMessage() {
        return  message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MailMessage that = (MailMessage) o;
        if (message != null ? !message.equals(that.message) : that.message != null) return  false;
        return true;
    }
}
