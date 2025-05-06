package toy.todo.repository;

import java.util.List;
import toy.todo.domain.Todo;

public interface TodoRepository {

    // create
    Todo save(Todo todo);

    // read one
    Todo findById(Long id);

    // read all
    List<Todo> findAll();

    // delete
    void delete(Long id);

    // update
    void update(Long id, Todo updateParam);

    // clear
    void clear();
}
