package com.example.questtugaslayout_0215
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InfoCard(
    namaRes: Int,
    nohpRes: Int? = null,
    alamatRes: Int,
    cardBgColorRes: Int,
    isCursive: Boolean = false,
    detailColorRes: Int
){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 6.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(id = cardBgColorRes)
        )
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = stringResource(id = R.string.desc_logo_umy),
                modifier = Modifier.size(60.dp)
            )
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 12.dp)
            ) {
                Text(
                    text = stringResource(id = namaRes),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = if (isCursive) FontFamily.Cursive else FontFamily.Default,
                    color = colorResource(id = R.color.white)
                )

                if (nohpRes != null) {
                    Text(
                        text = stringResource(id = nohpRes),
                        fontSize = 14.sp,
                        color = colorResource(id = detailColorRes)
                    )
                }
                Text(
                    text = stringResource(id = alamatRes),
                    fontSize = 14.sp,
                    color = colorResource(id = detailColorRes)
                )
            }
            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = stringResource(id = R.string.desc_logo_umy),
                modifier = Modifier.size(60.dp)
            )
        }
    }
}

@Composable
fun TampilanDaftarMahasiswa(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize()
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(
                text = stringResource(id = R.string.header_prodi),
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(id = R.color.black)
            )

            Text(
                text = stringResource(id = R.string.header_univ),
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                color = colorResource(id = R.color.black)
            )

            Spacer(modifier = Modifier.height(20.dp))

            // Card 1: Bambang Sumantri (Cursive, Tanpa Nomor HP)
            InfoCard(
                namaRes = R.string.nama_1,
                alamatRes = R.string.alamat_1,
                cardBgColorRes = R.color.card_bg_gray,
                isCursive = true,
                detailColorRes = R.color.yellow
            )

            // Card 2: Gibran Fathoni
            InfoCard(
                namaRes = R.string.nama_2,
                nohpRes = R.string.nohp_2,
                alamatRes = R.string.alamat_2,
                cardBgColorRes = R.color.card_bg_purple,
                detailColorRes = R.color.cyan
            )

            // Card 3: Zhilal Fadhilah
            InfoCard(
                namaRes = R.string.nama_3,
                nohpRes = R.string.nohp_3,
                alamatRes = R.string.alamat_3,
                cardBgColorRes = R.color.card_bg_blue,
                detailColorRes = R.color.cyan
            )

            // Card 4: Ahmad Alfian
            InfoCard(
                namaRes = R.string.nama_4,
                nohpRes = R.string.nohp_4,
                alamatRes = R.string.alamat_4,
                cardBgColorRes = R.color.card_bg_green,
                detailColorRes = R.color.cyan
            )
        }

    }
}
