package com.example.pertemuan3rv;

import java.util.ArrayList;

public class dataAlbum {
    private static String[] albumNames = {
            "Border: Day One",
            "Minisode1: Blue Hour",
            "The Dream Chapter: Magic",
            "Love Yourself: Tear",
            "You Never Walk Alone",
            "The Most Beautiful Moment in Life: Young Forever"
    };

    private static String[] albumDetails = {
            "Border: Day One is the debut extended play (EP) by Enhypen. It was released through Belift Lab, Genie Music and Stone Music Entertainment on November 30, 2020. The album consists of six tracks, including the lead single Given-Taken.",
            "Minisode1: Blue Hour is the third extended play (EP) by TXT. It was released through Big Hit Entertainment and Republic Records on October 26, 2020, five months after its predecessor, The Dream Chapter: Eternity.",
            "The Dream Chapter: Magic is the debut studio album by TXT. It was released on October 21, 2019 by Big Hit Entertainment.[1] It serves as a follow-up to the band's debut extended play The Dream Chapter: Star (2019).",
            "Love Yourself: Tear (stylized as LOVE YOURSELF 轉 'Tear') is the third Korean studio album (sixth overall) by South Korean boy band BTS. The album was released on May 18, 2018 by Big Hit Entertainment. It is available in four versions and contains eleven tracks, with Fake Love as its lead single.",
            "You Never Walk Alone is a repackage of BTS' second studio album Wings. It was released on February 13, 2017 with Spring Day serving as the album's title track. The album was the third best-selling album of 2017 in South Korea.As 2020, the album has sold more than one million copies alone and with the original edition more than two million copies.",
            "The Most Beautiful Moment in Life: Young Forever (Korean: 화양연화 Young Forever; Hanja: 花樣年華 Young Forever; RR: Hwayangyeonhwa Young Forever) is the first Korean-language compilation album by South Korean boy band BTS. The album was released on May 2, 2016, in two physical configurations, a day version and a night version."
    };


    private static int[] albumImages = {
            R.drawable.border,
            R.drawable.minisode,
            R.drawable.magic,
            R.drawable.tear,
            R.drawable.ynwa,
            R.drawable.yf,
    };
    public static ArrayList<modelAlbum> getListData()
    {
        modelAlbum ModelAlbum=null;
        ArrayList<modelAlbum> list= new ArrayList<>();
        for(int i=0;i<albumNames.length;i++)
        {
            ModelAlbum= new modelAlbum();
            ModelAlbum.setAlbumImages(albumImages[i]);
            ModelAlbum.setAlbumDetails(albumDetails[i]);
            ModelAlbum.setAlbumNames(albumNames[i]);
            list.add(ModelAlbum);
        }
        return list;
    }
}

