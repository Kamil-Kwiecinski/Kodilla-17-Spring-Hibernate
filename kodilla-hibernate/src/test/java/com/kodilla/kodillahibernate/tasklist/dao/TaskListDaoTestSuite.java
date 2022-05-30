package com.kodilla.kodillahibernate.tasklist.dao;

import com.kodilla.kodillahibernate.task.TaskList;
import com.kodilla.kodillahibernate.task.dao.TaskListDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "LISTNAME";
    private static final String DESCRIPTION = "DESCRIPTION";

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);

        //When
        taskListDao.save(taskList);
        int id = taskList.getId();
        List<TaskList> taskLists = taskListDao.findByListName(LISTNAME);

        //Then
        assertEquals(LISTNAME,taskLists.get(0).getListName());

        //CleanUp
        taskListDao.deleteById(id);

    }
}
