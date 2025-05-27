package com.example.ktra.constant;

public class Url {
    public static class Author {
        public static final String AAA = "";
        public static final String PREFIX = "/authors";
        public static final String GET_AUTHORS = PREFIX ;
        public static final String GET_AUTHOR = PREFIX + "/{id}";
        public static final String CREATE_AUTHOR = PREFIX ;
        public static final String UPDATE_AUTHOR = PREFIX + "/updateAuthor";
        public static final String DELETE_AUTHOR = PREFIX + "/deleteAuthor";
    }
    public static class Book {
        public static final String PREFIX = "/book";
        public static final String GET_BOOKS = PREFIX + "/getAllBooks";
        public static final String GET_BOOK = PREFIX + "/{id}";
        public static final String CREATE_BOOK = PREFIX + "/createBook";
        public static final String UPDATE_BOOK = PREFIX + "/updateBook";
        public static final String DELETE_BOOK = PREFIX + "/deleteBook";
    }
    public static class Category {
        public static final String PREFIX = "/category";
        public static final String GET_CATEGORYS = PREFIX + "/getAllCategories";
        public static final String GET_CATEGORY = PREFIX + "/{id}";
        public static final String CREATE_CATEGORY = PREFIX + "/createCategory";
        public static final String UPDATE_CATEGORY = PREFIX + "/updateCategory";
        public static final String DELETE_CATEGORY = PREFIX + "/deleteCategory";
    }
}
