package com.example.book.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.book.entity.Book;
import com.example.book.repository.BookRepository;

@RestController
@RequestMapping(value = "/api")
public class BookController {
	@Autowired
	private BookRepository bookRepository;

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/v1/book", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public List<Book> getAll() {
		List<Book> list = bookRepository.findAll();
		
//		List<Map> list2 = new ArrayList<>();
//		for (Book book:list) {
//			Map map = new HashMap();
//			map.put("bookid", book.getBookid());
//			map.put("name", book.getName());
//			map.put("author", book.getAuthor());
//			list2.add(map);
//		}
		
		return list;
	}
}
