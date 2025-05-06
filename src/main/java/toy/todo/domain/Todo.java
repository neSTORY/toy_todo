package toy.todo.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Todo {

    private long id;
    private String title;
    private String content;

    public Todo(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
