package br.edu.iftm.marcos.restapiatividade2.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "email")
public class Email implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "remetente", nullable = false, length = 100)
    private String from;

    @Column(name = "destinatario", nullable = false, length = 100)
    private String to;

    @Column(name = "assunto", nullable = false, length = 100)
    private String subject;

    @Column(name = "corpo", nullable = false, length = 100)
    private String body;

    @Column(name = "anexo", nullable = false, length = 200)
    private String attachment;

    public Email() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    @Override
    public String toString() {
        return "Email{" +
                "id=" + id +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                ", attachment='" + attachment + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email = (Email) o;
        return Objects.equals(id, email.id) && Objects.equals(from, email.from) && Objects.equals(to, email.to) && Objects.equals(subject, email.subject) && Objects.equals(body, email.body) && Objects.equals(attachment, email.attachment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, from, to, subject, body, attachment);
    }
}
