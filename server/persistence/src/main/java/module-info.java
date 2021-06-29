module com.manager.persistance {

    requires java.annotation;
    requires spring.beans;
    requires spring.context;
    requires spring.data.commons;
    requires spring.data.mongodb;
    requires lombok;

    exports com.manager.persistence.service;
    exports com.manager.persistence.domain;
    exports com.manager.persistence.repository;
}
