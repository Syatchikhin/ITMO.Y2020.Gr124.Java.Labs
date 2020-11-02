//package com.company;
//
//public class UserDTO {
//
//    @SerializedName("rate")
//    String rate;
//
//    @SerializedName("from")
//    String from;
//
//    @SerializedName("to")
//    String to;
//
//    String about;
//
//
//    @Override
//    public void onResponse(Call call, Response response) throws IOException {
//        String content = response.body().string();
//        Gson gson = new Gson();
//        UserDTO user = gson.fromJson(content, UserDTO.class);
//    }
//
//}
