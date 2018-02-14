package ct_dh.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by David on 14/02/2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.TodoItemHolder> {
    @Override
    public TodoItemHolder onCreateViewHolder (ViewGroup parent , int viewType ) {
        return null ;
        }

    @Override
    public void onBindViewHolder ( TodoItemHolder holder , int position ) {

        }

    @Override
    public int getItemCount () {
        return 0;
        }

    public class TodoItemHolder extends RecyclerView.ViewHolder {
        public TodoItemHolder ( View itemView ) {
            super (itemView) ;

        }
    }
}
