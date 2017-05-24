package com.sri.resource;

import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sri.service.BookInfoService;

@Path("/book-shop/{isbn}")
public class BookInfoResource {
	private BookInfoService bookInfoService;

	public void setBookInfoService(BookInfoService bookInfoService) {
		this.bookInfoService = bookInfoService;
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/price")
	public float getBookPrice(@PathParam("isbn") String isbn) {
		if (isbn != null && isbn.trim().length() > 0)
			return bookInfoService.getBookPrice(isbn);
		throw new NotFoundException("Book Not Found");
	}

}
