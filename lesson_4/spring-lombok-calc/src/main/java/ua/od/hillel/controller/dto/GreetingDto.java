package ua.od.hillel.controller.dto;

/**
 * Created by ruslangramatic on 5/5/18.
 */
public class GreetingDto {
    private long id;
    private String content;

    public GreetingDto(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GreetingDto)) return false;
        if (!super.equals(o)) return false;

        GreetingDto that = (GreetingDto) o;

        if (getId() != that.getId()) return false;
        return getContent() != null ? getContent().equals(that.getContent()) : that.getContent() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + (getContent() != null ? getContent().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "GreetingDto{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
