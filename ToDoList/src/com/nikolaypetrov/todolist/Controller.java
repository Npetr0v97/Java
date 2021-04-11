package com.nikolaypetrov.todolist;

import com.nikolaypetrov.todolist.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    private List<TodoItem> todoItems;
    @FXML
    private ListView<TodoItem> todoListView;
    @FXML
    private TextArea itemDetailsTextArea;

    public void initialize() {

        TodoItem item1 = new TodoItem("Mail bitrhday card", "Buy a 30th birthday card for John", LocalDate.of(2021, Month.APRIL,18));
        TodoItem item2 = new TodoItem("Do homework", "Do the tasks left from work", LocalDate.of(2021, Month.APRIL,11));
        TodoItem item3 = new TodoItem("Move to Sofia", "Move all of my stuff to Sofia", LocalDate.of(2021, Month.APRIL,25));
        TodoItem item4 = new TodoItem("Programming", "Do 5 programming tutorials", LocalDate.of(2021, Month.APRIL,10));
        TodoItem item5 = new TodoItem("Relax", "Play LoL with Simo", LocalDate.of(2021, Month.APRIL,11));

        todoItems = new ArrayList<>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);

        todoListView.getItems().setAll(todoItems);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

    @FXML
    public void handleClickListView(){
        TodoItem item = todoListView.getSelectionModel().getSelectedItem();

//        System.out.println("The selected item is " + item);
        StringBuilder sb = new StringBuilder(item.getDetails());
        sb.append("\n\n\n\n");
        sb.append("Due: ");
        sb.append(item.getDeadline().toString());
        itemDetailsTextArea.setText(sb.toString());
    }
}
