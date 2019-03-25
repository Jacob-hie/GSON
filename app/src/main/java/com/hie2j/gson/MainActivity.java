package com.hie2j.gson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private String animalStr = "{\n" +
            "\t\"animals\":{\n" +
            "\t\"dog\":[\n" +
            "\t\t{\"name\":\"Rufus\",\"breed\":\"labrador\",\"count\":1,\"twoFeet\":false},\n" +
            "\t\t{\"name\":\"Marty\",\"breed\":\"whippet\",\"count\":1,\"twoFeet\":false}\n" +
            "\t],\n" +
            "\t\"cat\":{\"name\":\"Matilda\"}\n" +
            "}\n" +
            "}";

    private String weatherStr = "{\n" +
            "    \"time\": \"2019-03-25 13:18:42\",\n" +
            "    \"cityInfo\": {\n" +
            "        \"city\": \"广州市\",\n" +
            "        \"cityId\": \"101280101\",\n" +
            "        \"parent\": \"广东\",\n" +
            "        \"updateTime\": \"12:44\"\n" +
            "    },\n" +
            "    \"date\": \"20190325\",\n" +
            "    \"message\": \"Success !\",\n" +
            "    \"status\": 200,\n" +
            "    \"data\": {\n" +
            "        \"shidu\": \"79%\",\n" +
            "        \"pm25\": 10,\n" +
            "        \"pm10\": 16,\n" +
            "        \"quality\": \"优\",\n" +
            "        \"wendu\": \"19\",\n" +
            "        \"ganmao\": \"各类人群可自由活动\",\n" +
            "        \"yesterday\": {\n" +
            "            \"date\": \"24\",\n" +
            "            \"sunrise\": \"06:29\",\n" +
            "            \"high\": \"高温 17.0℃\",\n" +
            "            \"low\": \"低温 12.0℃\",\n" +
            "            \"sunset\": \"18:39\",\n" +
            "            \"aqi\": 15,\n" +
            "            \"ymd\": \"2019-03-24\",\n" +
            "            \"week\": \"星期日\",\n" +
            "            \"fx\": \"无持续风向\",\n" +
            "            \"fl\": \"<3级\",\n" +
            "            \"type\": \"中雨\",\n" +
            "            \"notice\": \"记得随身携带雨伞哦\"\n" +
            "        },\n" +
            "        \"forecast\": [\n" +
            "            {\n" +
            "                \"date\": \"25\",\n" +
            "                \"sunrise\": \"06:28\",\n" +
            "                \"high\": \"高温 19.0℃\",\n" +
            "                \"low\": \"低温 14.0℃\",\n" +
            "                \"sunset\": \"18:40\",\n" +
            "                \"aqi\": 19,\n" +
            "                \"ymd\": \"2019-03-25\",\n" +
            "                \"week\": \"星期一\",\n" +
            "                \"fx\": \"无持续风向\",\n" +
            "                \"fl\": \"<3级\",\n" +
            "                \"type\": \"小雨\",\n" +
            "                \"notice\": \"雨虽小，注意保暖别感冒\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"date\": \"26\",\n" +
            "                \"sunrise\": \"06:27\",\n" +
            "                \"high\": \"高温 24.0℃\",\n" +
            "                \"low\": \"低温 16.0℃\",\n" +
            "                \"sunset\": \"18:40\",\n" +
            "                \"aqi\": 65,\n" +
            "                \"ymd\": \"2019-03-26\",\n" +
            "                \"week\": \"星期二\",\n" +
            "                \"fx\": \"无持续风向\",\n" +
            "                \"fl\": \"<3级\",\n" +
            "                \"type\": \"阴\",\n" +
            "                \"notice\": \"不要被阴云遮挡住好心情\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"date\": \"27\",\n" +
            "                \"sunrise\": \"06:26\",\n" +
            "                \"high\": \"高温 26.0℃\",\n" +
            "                \"low\": \"低温 18.0℃\",\n" +
            "                \"sunset\": \"18:41\",\n" +
            "                \"aqi\": 51,\n" +
            "                \"ymd\": \"2019-03-27\",\n" +
            "                \"week\": \"星期三\",\n" +
            "                \"fx\": \"无持续风向\",\n" +
            "                \"fl\": \"<3级\",\n" +
            "                \"type\": \"多云\",\n" +
            "                \"notice\": \"阴晴之间，谨防紫外线侵扰\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"date\": \"28\",\n" +
            "                \"sunrise\": \"06:25\",\n" +
            "                \"high\": \"高温 27.0℃\",\n" +
            "                \"low\": \"低温 20.0℃\",\n" +
            "                \"sunset\": \"18:41\",\n" +
            "                \"aqi\": 55,\n" +
            "                \"ymd\": \"2019-03-28\",\n" +
            "                \"week\": \"星期四\",\n" +
            "                \"fx\": \"无持续风向\",\n" +
            "                \"fl\": \"<3级\",\n" +
            "                \"type\": \"多云\",\n" +
            "                \"notice\": \"阴晴之间，谨防紫外线侵扰\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"date\": \"29\",\n" +
            "                \"sunrise\": \"06:24\",\n" +
            "                \"high\": \"高温 25.0℃\",\n" +
            "                \"low\": \"低温 18.0℃\",\n" +
            "                \"sunset\": \"18:41\",\n" +
            "                \"aqi\": 52,\n" +
            "                \"ymd\": \"2019-03-29\",\n" +
            "                \"week\": \"星期五\",\n" +
            "                \"fx\": \"无持续风向\",\n" +
            "                \"fl\": \"<3级\",\n" +
            "                \"type\": \"小雨\",\n" +
            "                \"notice\": \"雨虽小，注意保暖别感冒\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"date\": \"30\",\n" +
            "                \"sunrise\": \"06:23\",\n" +
            "                \"high\": \"高温 25.0℃\",\n" +
            "                \"low\": \"低温 19.0℃\",\n" +
            "                \"sunset\": \"18:42\",\n" +
            "                \"aqi\": 57,\n" +
            "                \"ymd\": \"2019-03-30\",\n" +
            "                \"week\": \"星期六\",\n" +
            "                \"fx\": \"无持续风向\",\n" +
            "                \"fl\": \"<3级\",\n" +
            "                \"type\": \"多云\",\n" +
            "                \"notice\": \"阴晴之间，谨防紫外线侵扰\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"date\": \"31\",\n" +
            "                \"sunrise\": \"06:22\",\n" +
            "                \"high\": \"高温 24.0℃\",\n" +
            "                \"low\": \"低温 18.0℃\",\n" +
            "                \"sunset\": \"18:42\",\n" +
            "                \"ymd\": \"2019-03-31\",\n" +
            "                \"week\": \"星期日\",\n" +
            "                \"fx\": \"无持续风向\",\n" +
            "                \"fl\": \"<3级\",\n" +
            "                \"type\": \"多云\",\n" +
            "                \"notice\": \"阴晴之间，谨防紫外线侵扰\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"date\": \"01\",\n" +
            "                \"sunrise\": \"06:21\",\n" +
            "                \"high\": \"高温 26.0℃\",\n" +
            "                \"low\": \"低温 18.0℃\",\n" +
            "                \"sunset\": \"18:42\",\n" +
            "                \"ymd\": \"2019-04-01\",\n" +
            "                \"week\": \"星期一\",\n" +
            "                \"fx\": \"东北风\",\n" +
            "                \"fl\": \"<3级\",\n" +
            "                \"type\": \"多云\",\n" +
            "                \"notice\": \"阴晴之间，谨防紫外线侵扰\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"date\": \"02\",\n" +
            "                \"sunrise\": \"06:20\",\n" +
            "                \"high\": \"高温 26.0℃\",\n" +
            "                \"low\": \"低温 18.0℃\",\n" +
            "                \"sunset\": \"18:43\",\n" +
            "                \"ymd\": \"2019-04-02\",\n" +
            "                \"week\": \"星期二\",\n" +
            "                \"fx\": \"东南风\",\n" +
            "                \"fl\": \"<3级\",\n" +
            "                \"type\": \"晴\",\n" +
            "                \"notice\": \"愿你拥有比阳光明媚的心情\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"date\": \"03\",\n" +
            "                \"sunrise\": \"06:19\",\n" +
            "                \"high\": \"高温 27.0℃\",\n" +
            "                \"low\": \"低温 20.0℃\",\n" +
            "                \"sunset\": \"18:43\",\n" +
            "                \"ymd\": \"2019-04-03\",\n" +
            "                \"week\": \"星期三\",\n" +
            "                \"fx\": \"南风\",\n" +
            "                \"fl\": \"<3级\",\n" +
            "                \"type\": \"小雨\",\n" +
            "                \"notice\": \"雨虽小，注意保暖别感冒\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"date\": \"04\",\n" +
            "                \"sunrise\": \"06:18\",\n" +
            "                \"high\": \"高温 30.0℃\",\n" +
            "                \"low\": \"低温 22.0℃\",\n" +
            "                \"sunset\": \"18:43\",\n" +
            "                \"ymd\": \"2019-04-04\",\n" +
            "                \"week\": \"星期四\",\n" +
            "                \"fx\": \"南风\",\n" +
            "                \"fl\": \"<3级\",\n" +
            "                \"type\": \"多云\",\n" +
            "                \"notice\": \"阴晴之间，谨防紫外线侵扰\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"date\": \"05\",\n" +
            "                \"sunrise\": \"06:18\",\n" +
            "                \"high\": \"高温 31.0℃\",\n" +
            "                \"low\": \"低温 22.0℃\",\n" +
            "                \"sunset\": \"18:44\",\n" +
            "                \"ymd\": \"2019-04-05\",\n" +
            "                \"week\": \"星期五\",\n" +
            "                \"fx\": \"南风\",\n" +
            "                \"fl\": \"<3级\",\n" +
            "                \"type\": \"多云\",\n" +
            "                \"notice\": \"阴晴之间，谨防紫外线侵扰\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"date\": \"06\",\n" +
            "                \"sunrise\": \"06:17\",\n" +
            "                \"high\": \"高温 30.0℃\",\n" +
            "                \"low\": \"低温 22.0℃\",\n" +
            "                \"sunset\": \"18:44\",\n" +
            "                \"ymd\": \"2019-04-06\",\n" +
            "                \"week\": \"星期六\",\n" +
            "                \"fx\": \"南风\",\n" +
            "                \"fl\": \"<3级\",\n" +
            "                \"type\": \"多云\",\n" +
            "                \"notice\": \"阴晴之间，谨防紫外线侵扰\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"date\": \"07\",\n" +
            "                \"sunrise\": \"06:16\",\n" +
            "                \"high\": \"高温 29.0℃\",\n" +
            "                \"low\": \"低温 23.0℃\",\n" +
            "                \"sunset\": \"18:45\",\n" +
            "                \"ymd\": \"2019-04-07\",\n" +
            "                \"week\": \"星期日\",\n" +
            "                \"fx\": \"东南风\",\n" +
            "                \"fl\": \"<3级\",\n" +
            "                \"type\": \"小雨\",\n" +
            "                \"notice\": \"雨虽小，注意保暖别感冒\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"date\": \"08\",\n" +
            "                \"sunrise\": \"06:15\",\n" +
            "                \"high\": \"高温 29.0℃\",\n" +
            "                \"low\": \"低温 23.0℃\",\n" +
            "                \"sunset\": \"18:45\",\n" +
            "                \"ymd\": \"2019-04-08\",\n" +
            "                \"week\": \"星期一\",\n" +
            "                \"fx\": \"东南风\",\n" +
            "                \"fl\": \"<3级\",\n" +
            "                \"type\": \"小雨\",\n" +
            "                \"notice\": \"雨虽小，注意保暖别感冒\"\n" +
            "            }\n" +
            "        ]\n" +
            "    }\n" +
            "}";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = new User("李四",21);
                Gson gson = new Gson();
                String str = gson.toJson(user);
                Log.e(TAG,"str = " + str);
                JSONObject jsonObject = new JSONObject();
                try {
                    jsonObject.put("name",user.getName());
                    jsonObject.put("age",user.getAge());
                    Log.e(TAG,"jsonObject = " + jsonObject.toString());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });

        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userStr = "{\"name\":\"李四\",\"age\":21}";
                Gson gson = new Gson();
                User user = gson.fromJson(userStr,User.class);
                Log.e(TAG,user.toString());
            }
        });

        findViewById(R.id.btn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gson gson = new Gson();
                Animal animal = gson.fromJson(animalStr,Animal.class);
                String dogName = animal.getAnimals().getDog().get(0).getName();
                String catName = animal.getAnimals().getCat().getName();
                Log.e(TAG,"dog = " + dogName + " cat = " + catName);
            }
        });

        findViewById(R.id.btn4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gson gson = new Gson();
                Weather weather = gson.fromJson(weatherStr,Weather.class);
                String type = weather.getData().getForecast().get(0).getType();
                String low = weather.getData().getForecast().get(0).getLow();
                String high = weather.getData().getForecast().get(0).getHigh();
                Log.e(TAG,"天气 " + type + low + high);
            }
        });
    }
}
