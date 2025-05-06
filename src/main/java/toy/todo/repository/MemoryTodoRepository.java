package toy.todo.repository;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import toy.todo.domain.Todo;

@Repository
public class MemoryTodoRepository implements TodoRepository {

    private static final Map<Long, Todo> store = new HashMap<>();
    private Long sequence = 0L;

    @Override
    public Todo save(Todo todo) {
        todo.setId(++sequence);
        store.put(sequence, todo);
        return todo;
    }

    @Override
    public Todo findById(Long id) {
        return store.get(id);
    }

    @Override
    public List<Todo> findAll() {
        return new ArrayList<>(store.values());
    }

    @Override
    public void delete(Long id) {
        store.remove(id);
    }

    @Override
    public void update(Long id, Todo updateParam) {
        Todo todo = store.get(id);
        todo.setContent(updateParam.getContent());
        todo.setTitle(updateParam.getTitle());
    }

    @Override
    public void clear() {
        store.clear();
    }
}
