package toy.todo.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import toy.todo.domain.Todo;

class MemoryTodoRepositoryTest {

    TodoRepository repository = new MemoryTodoRepository();

    @Test
    void save() throws Exception {
        //given
        Todo todo1 = new Todo("정보처리기사", "1회 기출풀기");
        Todo todo2 = new Todo("스프링", "MVC2 1강 듣기");

        //when
        Todo savedTodo1 = repository.save(todo1);
        repository.save(todo2);

        //then
        assertThat(savedTodo1).isEqualTo(todo1);
    }

    @Test
    void findById() throws Exception {
        //given
        Todo todo1 = new Todo("정보처리기사", "1회 기출풀기");
        Todo todo2 = new Todo("스프링", "MVC2 1강 듣기");

        repository.save(todo1);
        repository.save(todo2);

        //when
        Todo findTodo1 = repository.findById(todo1.getId());
        Todo findTodo2 = repository.findById(todo2.getId());

        //then
        assertThat(findTodo1).isEqualTo(todo1);
    }

    @Test
    public void findAll() throws Exception {
        //given

        //when

        //then

    }

}