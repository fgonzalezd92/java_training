package com.herbalife.examples;

public class DisposableExample {
    public static void main(String[] args) {
        DBResource dbResource = new DBResource();
        dbResource.cleanup();

        try(FileResource fileResource = new FileResource()){

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("End of main");
    }
}

class FileResource implements AutoCloseable{
    public FileResource() {
        System.out.println("FileResource constructor");
    }

    public void close() throws Exception {
        System.out.println("FileResource cleanup");
    }
}


class DBResource{
    public DBResource(){
        System.out.println("DBResource constructor");
    }

    public void cleanup(){
        System.out.println("DBResource cleanup");
    }
}