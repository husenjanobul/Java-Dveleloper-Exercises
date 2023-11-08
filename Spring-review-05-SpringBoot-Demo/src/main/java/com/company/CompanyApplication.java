package com.company;

import com.company.model.Comment;
import com.company.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CompanyApplication {

    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Husenjan");
        comment.setText("Spring Framework");

        ApplicationContext context = SpringApplication.run(CompanyApplication.class, args);

        CommentService cs = context.getBean(CommentService.class);
        cs.publishComment(comment);
    }

}
