package com.example.btvn8.constant;

public class UrlConstant {
    public static class User {
        public static final String PREFIX = "/users";
        public static final String GET_USERS = PREFIX;
        public static final String GET_USER = PREFIX + "/{id}";
        public static final String CREATE_USER = PREFIX;
        public static final String UPDATE_USER = PREFIX + "/{id}";
        public static final String DELETE_USER = PREFIX + "/{id}";
    }

    public static class Department {
        public static final String PREFIX = "/departments";
        public static final String GET_DEPARTMENTS = PREFIX;
        public static final String GET_DEPARTMENT = PREFIX + "/{id}";
        public static final String CREATE_DEPARTMENT = PREFIX;
        public static final String UPDATE_DEPARTMENT = PREFIX + "/{id}";
        public static final String DELETE_DEPARTMENT = PREFIX + "/{id}";
    }

    public static class Position {
        public static final String PREFIX = "/positions";
        public static final String GET_POSITIONS = PREFIX;
        public static final String GET_POSITION = PREFIX + "/{id}";
        public static final String CREATE_POSITION = PREFIX;
        public static final String UPDATE_POSITION = PREFIX + "/{id}";
        public static final String DELETE_POSITION = PREFIX + "/{id}";
    }

    public static class Employee {
        public static final String PREFIX = "/employees";
        public static final String GET_EMPLOYEES = PREFIX;
        public static final String GET_EMPLOYEE = PREFIX + "/{id}";
        public static final String CREATE_EMPLOYEE = PREFIX;
        public static final String UPDATE_EMPLOYEE = PREFIX + "/{id}";
        public static final String DELETE_EMPLOYEE = PREFIX + "/{id}";
    }
}
