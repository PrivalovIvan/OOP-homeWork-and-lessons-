package src.personal.model;

import java.util.Date;

public class Notes {
    private String id = "";
    private Date date;
    private String header;
    private String text;

    public Notes(Date date, String header, String text) {
        this.date = date;
        this.header = header;
        this.text = text;
    }

    public Notes(String id, Date date, String header, String text) {
        this(date, header, text);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return String.format("Идентафикатор: %s\nДата: " + getDate() + "\nЗаголовок: %s.\nТекст: %s.", getId(),
                getHeader(), getText());
    }
}
