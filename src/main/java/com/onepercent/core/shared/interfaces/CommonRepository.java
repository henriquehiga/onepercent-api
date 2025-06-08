package com.onepercent.core.shared.interfaces;

public interface CommonRepository<T, K> {
    void save(T data);
    T one(K id);
    T[] list();
    void update(K id, T data);
}