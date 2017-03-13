package fm.jiecao.jiecaovideoplayer;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;
import fm.jiecao.jcvideoplayer_lib.VideoBean;

public class RecyclerViewVideoAdapter extends RecyclerView.Adapter<RecyclerViewVideoAdapter.MyViewHolder> {


    private Context context;
    public static final String TAG = "RecyclerViewVideoAdapter";
    private List<VideoBean> videoBeanList;


    public RecyclerViewVideoAdapter(Context context, List<VideoBean> videoBeanList) {
        this.context = context;
        this.videoBeanList = videoBeanList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder holder = new MyViewHolder(LayoutInflater.from(
                context).inflate(R.layout.item_videoview, parent,
                false));



        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.jcVideoPlayer.setUp(videoBeanList.get(position), JCVideoPlayer.SCREEN_LAYOUT_LIST);
        holder.jcVideoPlayer.setTag(position);
    }

    @Override
    public int getItemCount() {
        return videoBeanList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        JCVideoPlayerStandard jcVideoPlayer;

        public MyViewHolder(View itemView) {
            super(itemView);
            jcVideoPlayer = (JCVideoPlayerStandard) itemView.findViewById(R.id.videoplayer);

        }
    }

}
