package com.example.asusx453sa.YOGAADITAMA_1202152172_MODUL3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ASUS X453SA on 2/24/2018.
 */

    public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private ArrayList<String> rvNamaminuman,rvPMinuman;
    private ArrayList<Integer> rvImg;
    public RecyclerViewAdapter(ArrayList<String> namaMinuman, ArrayList<String> pminuman, ArrayList<Integer> gambar) {
        rvNamaminuman = namaMinuman;
        rvPMinuman = pminuman;
        rvImg = gambar;
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvTitle;
        public TextView tvSubtitle;
        public ImageView imgminuman;
        private RelativeLayout ItemList;

        private Context context;

        public ViewHolder(View itemView) {
            super(itemView);

            context = itemView.getContext();
            tvTitle = (TextView) itemView.findViewById(R.id.tittle);
            tvSubtitle = (TextView) itemView.findViewById(R.id.sub_tittle);
            imgminuman = (ImageView) itemView.findViewById(R.id.image_gambar);
            ItemList = itemView.findViewById(R.id.layout_item);

            ItemList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent myintent = new Intent(context,DetailActivity.class);
                    String minum = "";
                    switch (getAdapterPosition()){

                        case 0 :
                            myintent.putExtra("nama",rvNamaminuman.get(getAdapterPosition()));
                            myintent.putExtra("gambar",rvImg.get(getAdapterPosition()));
                            minum = "Air minum dalam kemasan (AMDK) di Indonesia bermula dari orang asing yang tak bisa mengonsumsi air rebusan. Seorang mantan pegawai Pertamina memiliki ide dan kemudian membuat pabrik AMDK." +
                                    "produk air minum dalam kemasan (AMDK)itu sudah menjadi barang familiar. Hampir setiap hari dijumpai dan diminum oleh orang-orang di perkotaan seperti Jakarta.  " +
                                    "Aqua adalah merek AMDK dengan penjualan terbesar di Indonesia ";
                            myintent.putExtra("pminuman",minum);
                            context.startActivity(myintent);
                            break;
                        case 1 :
                            myintent.putExtra("nama",rvNamaminuman.get(getAdapterPosition()));
                            myintent.putExtra("gambar",rvImg.get(getAdapterPosition()));
                            minum = " Kemunculan AMDK pertama di Indonesia tidak lepas dari sejarah produk bermerek Aqua. Sebab Aqua menjadi produk AMDK pertama yang diproduksi di Indonesia." +
                                    " PT Aqua Golden Mississippi Tbk di Indonesia sejak tahun 1973. Selain di Indonesia, Aqua juga dijual di Malaysia," +
                                    " Singapura, dan Brunei. Aqua adalah merek AMDK dengan penjualan terbesar di Indonesia dan ";
                            myintent.putExtra("pminuman",minum);
                            context.startActivity(myintent);
                            break;
                        case 2 :
                            myintent.putExtra("nama",rvNamaminuman.get(getAdapterPosition()));
                            myintent.putExtra("gambar",rvImg.get(getAdapterPosition()));
                            minum = " Le Minerale dibikin oleh PT Tirta Frisindo Jaya, yang merupakan anak usaha Mayora Indah yang bergerak di bidang produksi minuman" +
                                    " Mayora Indah berharap kiprah bisnis anyar itu bisa berdampak positif bagi kinerja." +
                                    " Sayangnya, perusahaan yang tercatat dengan kode MYOR di Bursa Efek Indonesia tersebut terkesan belum percaya diri membeberkan target.";
                            myintent.putExtra("pminuman",minum);
                            context.startActivity(myintent);
                            break;
                        case 3 :
                            myintent.putExtra("nama",rvNamaminuman.get(getAdapterPosition()));
                            myintent.putExtra("gambar",rvImg.get(getAdapterPosition()));
                            minum = "PT Sariguna Primatirta, adalah salah satu perusahaan yang mendapatkan pengakuan dari REBI sebagai Pelopor air minum dalam kemasan dengan oksigen di Indonesia (CLEO)." +
                                    " Pada 7 Maret 2004, diluncurkan produk Air Murni Cleo sebagai salah satu produk andalan Tanobel dalam kemasan cup 250 mL, botol 330 mL, 550 mL," +
                                    " 1.200 mL, 6 L dan galon 19 L. Setelah itu, Tanobel melebarkan sayap produksi Air Murni Cleo ke berbagai daerah di Indonesia";
                            myintent.putExtra("pminuman",minum);
                            context.startActivity(myintent);
                            break;
                        case 4 :
                            myintent.putExtra("nama",rvNamaminuman.get(getAdapterPosition()));
                            myintent.putExtra("gambar",rvImg.get(getAdapterPosition()));
                            minum = "Perusahaan Air Minum Dalam Kemasan AMDK Club ini berdiri pada tahun 1988 dengan nama PT Tirta Bahagia berpusat di Surabaya. Hingga tahun 2012" +
                                    " Group Tirta Bahagia sudah mempunyai 17 pabrik AMDK di seluruh Indonesia,  " +
                                    "(hal ini bertujuan untuk lebih mendekatkan produk air mineral Club kepada masyarakat luas.";
                            myintent.putExtra("pminuman",minum);
                            context.startActivity(myintent);
                            break;
                        case 5 :
                            myintent.putExtra("nama",rvNamaminuman.get(getAdapterPosition()));
                            myintent.putExtra("gambar",rvImg.get(getAdapterPosition()));
                            minum = "AMIDIS adalah air minum kesehatan yang diproses melalui sistem distilasi atau penyulingan atau penguapan," +
                                    "melalui proses pemanasan hingga 180 derajat celcius sehingga menghasilkan air minum yang murni (NON-MINERAL)" +
                                    " tanpa kandungan polutan, mineral anorganik maupun bahan kontaminasi lain seperti bahan kimia maupun bahan pestisida.";
                            myintent.putExtra("pminuman",minum);
                            context.startActivity(myintent);
                            break;
                        case 6 :
                            myintent.putExtra("nama",rvNamaminuman.get(getAdapterPosition()));
                            myintent.putExtra("gambar",rvImg.get(getAdapterPosition()));
                            minum = "Ades (sebelumnya pernah disebut AdeS) adalah merek air mineral atau air minum dalam kemasan " +
                                    "(AMDK) yang diproduksi oleh PT. " +
                                    "Coca-Cola Bottling Indonesia, Bekasi. Air mineral tersebut juga dikenal sebagai I-Lohas di Jepang. ";
                            myintent.putExtra("pminuman",minum);
                            context.startActivity(myintent);
                            break;
                        case 7 :
                            myintent.putExtra("nama",rvNamaminuman.get(getAdapterPosition()));
                            myintent.putExtra("gambar",rvImg.get(getAdapterPosition()));
                            minum = "Equil merupakan salah satu produk air mineral dalam kemasan yang bisa dikatakan unik. Pasalnya, " +
                                    "jika produk air mineral merek lainnya dikemas dalam gelas plastik atau botol plastik, " +
                                    "namun Equil ini memiliki kemasan botol berbahan kaca yang sekilas mirip dengan botol untuk minuman keras";
                            myintent.putExtra("pminuman",minum);
                            context.startActivity(myintent);
                            break;
                        case 8 :
                            myintent.putExtra("nama",rvNamaminuman.get(getAdapterPosition()));
                            myintent.putExtra("gambar",rvImg.get(getAdapterPosition()));
                            minum = "Saat ini Evian dimiliki oleh Groupe Danone, sebuah perusahaan multinasional Perancis." +
                                    " Selain air mineral, Groupe Danone memakai nama Evian " +
                                    "untuk jajaran produk perawatan kulit organik serta sebuah resor mewah di Perancis.";
                            myintent.putExtra("pminuman",minum);
                            context.startActivity(myintent);
                            break;
                        case 9 :
                            myintent.putExtra("nama",rvNamaminuman.get(getAdapterPosition()));
                            myintent.putExtra("gambar",rvImg.get(getAdapterPosition()));
                            minum = "Nestlé adalah sebuah perusahaan multinternasional di Vevey, Swiss yang bergerak dalam bidang makanan minuman." +
                                    " Didirikan pada tahun 1868 oleh Hendry Nestlé";
                            myintent.putExtra("pminuman",minum);
                            context.startActivity(myintent);
                            break;
                        case 10 :
                            myintent.putExtra("nama",rvNamaminuman.get(getAdapterPosition()));
                            myintent.putExtra("gambar",rvImg.get(getAdapterPosition()));
                            minum = "VIT adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Tirta Investama di Indonesia." +
                                    " Mulai diproduksi sejak tanggal 16 November 1982 dan awalnya dimiliki oleh PT Varia Industri Tirta. Pada tanggal 17 Juli 1987  " +
                                    "kepemilikan PT Varia Industri Tirta beralih kepada Tirto Utomo.";
                            myintent.putExtra("pminuman",minum);
                            context.startActivity(myintent);
                            break;

                    }
                }
            });


        }
    }

@Override
public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        // mengeset ukuran view, margin, padding, dan parameter layout lainnya
        ViewHolder vholder = new ViewHolder(v);
        return vholder;
        }

@Override
public void onBindViewHolder(RecyclerViewAdapter.ViewHolder holder, int position) {
final String name = rvNamaminuman.get(position);
final String harga = rvPMinuman.get(position);
final Integer test = rvImg.get(position);
        holder.tvTitle.setText(name);
        holder.tvSubtitle.setText(harga);
        holder.imgminuman.setImageResource(test);


        }

@Override
public int getItemCount() {
        return rvNamaminuman.size();
        }
        }
