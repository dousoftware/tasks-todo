package com.dousoftware.yapacaklarm;

import android.provider.BaseColumns;

public class TaskContract {
    public static final String DB_NAME = "alltasks"; //veritabanı adı
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        //tablo adını 'tasks' yani görevler olarak belirledik
        public static final String TABLE = "tasks";
        //tabloda kayıt altına alınacak görev
        public static final String COL_TASK_TITLE = "title";
    }
}
