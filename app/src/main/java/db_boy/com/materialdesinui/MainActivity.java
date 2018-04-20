package db_boy.com.materialdesinui;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.orhanobut.logger.Logger;

import db_boy.com.materialdesinui.immersion.ImmersionActivity;

public class MainActivity extends AppCompatActivity {
    String[] items = {"沉浸式", "2222"};
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        TestAdapter adapter = new TestAdapter();
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));


        adapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch (position) {
                    case 0:
                        Logger.i("---1---" + items[position]);
                        startActivity(ImmersionActivity.getInstance(MainActivity.this));
                        break;

                    case 1:
                        Logger.i("---2---" + items[position]);

                        break;
                    default:
                        break;


                }
            }
        });
    }


    //define interface
    interface OnItemClickListener {
        void onItemClick(View view, int position);
    }


    class TestAdapter extends RecyclerView.Adapter<TestAdapter.Holder> {
        private OnItemClickListener mOnItemClickListener = null;

        @Override
        public TestAdapter.Holder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new Holder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_test, parent, false));
        }

        @Override
        public void onBindViewHolder(TestAdapter.Holder holder, final int position) {
            holder.tvText.setText(items[position]);
            holder.tvText.setBackgroundColor(Color.rgb((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mOnItemClickListener != null) {
                        mOnItemClickListener.onItemClick(v, position);
                    }
                }
            });
        }

        @Override
        public int getItemCount() {
            return items.length;
        }

        public void setOnItemClickListener(OnItemClickListener mOnItemClickListener) {
            this.mOnItemClickListener = mOnItemClickListener;
        }


        class Holder extends RecyclerView.ViewHolder {

            private TextView tvText;

            public Holder(View itemView) {
                super(itemView);
                tvText = itemView.findViewById(R.id.tv);
            }
        }
    }
}
