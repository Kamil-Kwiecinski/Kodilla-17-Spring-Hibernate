package com.kodilla.kodillahibernate.task.dao;

import com.kodilla.kodillahibernate.task.TaskList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface TaskListDao extends CrudRepository <TaskList, Integer> {

    List<TaskList> findByListName(String listName);
}
