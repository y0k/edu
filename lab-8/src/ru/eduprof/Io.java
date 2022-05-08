package ru.eduprof;

abstract class Io {
    String write;
    String read;

    Io(String write, String read) {
        this.write = write;
        this.read = read;
    }

    public String getWrite() {
        return write;
    }

    public void setWrite(String write) {
        this.write = write;
    }

    public String getRead() {
        return read;
    }

    public void setRead(String read) {
        this.read = read;
    }

    @Override
    public String toString() {
        return "Io{" +
                "write='" + write + '\'' +
                ", read='" + read + '\'' +
                '}';
    }
}
