//package com.example.ck;
//
//import android.os.AsyncTask;
//
//import java.util.List;
//
//public class FetchOneUserByUserNameAsyncTask extends AsyncTask<String, String, User> {
//    public UserDatabase getDb() {
//        return db;
//    }
//
//    public void setDb(UserDatabase db) {
//        this.db = db;
//    }
//
//    public UserDelegate getDelegate() {
//        return delegate;
//    }
//
//    public void setDelegate(UserDelegate delegate) {
//        this.delegate = delegate;
//    }
//
//    private UserDatabase db;
//    private UserDelegate delegate;
//    private User user;
//    @Override
//    protected User doInBackground(String... strings) {
//        user = db.mUserDao().fetchOneUserByUserName(user.getUsername());
//        return user;
//    }
//
//    protected void onPostExecute(User user) {
//        delegate.fetchOneUserByUserName(user);
//
//    }
//}