package models;

import java.util.Iterator;

/**
 * Created by zhengyiwang on 4/18/16.
 */
public abstract class ReplyIterator implements Iterator<Reply> {


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Reply next() {
        return null;
    }
}
