/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.R

object Store {

    private lateinit var mDataList: HashMap<Int, DogInfo>

    init {
        val dataList = listOf(
            DogInfo(
                1,
                "小艾-上海宠物领养",
                R.mipmap.dog1,
                "小艾，一岁，公，已绝育已驱虫已疫苗，亲人活波，乖巧懂事，长相秀气，体重7kg左右 寻上海地区爱心人士无偿领养，善待终老，不离不弃！"
            ),
            DogInfo(
                2,
                "缘缘-上海宠物领养",
                R.mipmap.dog2,
                "缘缘，公，1岁半，已绝育已驱虫已疫苗，性格亲人乖巧，小体，6kg左右。之前被人打伤脊柱伤到后腿神经，现已治愈，走路略跛，但完全不影响日常生活。寻上海地区爱心人士无偿领养，善待终老不离不弃！"
            ),
            DogInfo(
                3,
                "艾米-深圳宠物领养",
                R.mipmap.dog3,
                "艾米是去年12月捡到的，捡到的时候有皮肤病，眼睛眼膜水肿大白，现在皮肤病已经全愈，眼膜水肿已经恢复但还需要每天滴眼药水护理，它性格特别温顺文静，不叫不闹，会定点上厕所，肚子看起来有点大，经过B超检查医生说是胖，目前体重10斤左右，找喜欢安静的深圳家庭收养。"
            ),
            DogInfo(
                4,
                "小黑-上海宠物领养",
                R.mipmap.dog4,
                "小黑性格活泼亲人，已绝育驱虫疫苗，希望能够找到不离不弃的主人给它一个家！"
            ),
            DogInfo(
                5,
                "皮皮-上海宠物领养",
                R.mipmap.dog5,
                "非常漂亮清爽的小可爱"
            ),
            DogInfo(
                6,
                "泰迪串串-上海宠物领养",
                R.mipmap.dog6,
                "泰迪串串 名叫妞妞 1岁 妹妹 性格乖巧亲人 是个通人性的小可爱 寻上海地区爱心人士无偿领养 善待终老 不离不弃 外出牵绳。"
            ),
            DogInfo(
                7,
                "【济南】两月白色拉布拉多有偿领养-济南宠物领养",
                R.mipmap.dog7,
                "2021 2.21购入 因工作原因实在无力饲养 忍痛转出 有购买证明 健康无疾病 已打一针疫苗 可上门看狗 领养要求 真心爱狗 有能力能好好对他"
            ),
            DogInfo(
                8,
                "小白-上海宠物领养",
                R.mipmap.dog8,
                "2岁 已绝育 乖巧听话 不吵不闹 适合陪伴老人 或者家里有小孩的有缘人"
            )
        )
        mDataList = HashMap()
        dataList.forEach {
            mDataList[it.id] = it
        }
    }

    fun getList(): List<DogInfo> = mDataList.values.toList()

    fun getDogById(id: Int) = mDataList[id]
}
