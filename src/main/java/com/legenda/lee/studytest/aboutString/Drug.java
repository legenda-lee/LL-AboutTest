package com.legenda.lee.studytest.aboutString;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2021-07-08 3:28 下午
 * @description:
 */
public class Drug {

    public static void main(String[] args) {
        String dupin = "去乙酰毛花苷丙,洋地黄毒苷,毛果芸香碱,水杨酸毒扁豆碱,阿托品,氢溴酸后马托品,氢溴酸东莨菪碱,三氧化二砷,亚砷酸钾,亚砷酸注射液,升贡,士的宁,A型肉毒毒素及其制剂,麦角酸,麻黄素,麦角胺,麦角新碱,伪麻黄素,消旋麻黄素,去甲麻黄素,甲基麻黄素,麻黄浸膏,麻黄浸膏粉,麻黄素类物质,复方苯巴比妥溴化钠片,安替比林咖啡因片,人血白蛋白,全氟丙烷人血白蛋白微球注射液,注射用亚锡聚合白蛋白,卵白蛋白口服液,乙型肝炎人免疫球蛋白,人免疫球蛋白,冻干乙型肝炎人免疫球蛋白,兔抗人胸腺细胞免疫球蛋白,冻干静注人免疫球蛋白(pH4),抗人T细胞兔免疫球蛋白,冻干静注乙型肝炎人免疫球蛋白(pH4),猪免疫球蛋白口服液,狂犬病人免疫球蛋白,抗人T细胞兔免疫球蛋白,破伤风人免疫球蛋白,静注人免疫球蛋白(pH4),静注人免疫球蛋白,静注乙型肝炎人免疫球蛋白(pH4),外用冻干人凝血酶,凝血酶冻干粉,凝血酶,冻干人凝血酶,冻干人纤维蛋白原,注射用重组人凝血因子Ⅶa,注射用重组人凝血因子Ⅷ,注射用重组人凝血因子Ⅸ";
        String jingshen = "氟哌噻吨美利曲辛片,复方地西泮片,复方斑蝥胶囊,雪上一枝蒿速效止痛搽剂,复方苯巴比妥溴化钠片,安替比林咖啡因片,硝酸毛果芸香碱滴眼液,氨酚曲马多胶囊,硫酸阿托品眼用凝胶,组织胺人免疫球蛋白,冻干人血白蛋白,斑蝥素乳膏,人纤维蛋白原,人凝血酶原复合物,硝酸毛果芸香碱片,单盐酸氟西泮胶囊,雄楚医院人血白蛋白注射服务项目-武汉瑞德生物,复方氢溴酸东莨菪碱贴膏,雪上一枝蒿片,去甲斑蝥素片,雄楚医院人血白蛋白注射服务项目-武汉血液制品,景泰医院人血白蛋白注射服务项目-西班牙基立福,人破伤风免疫球蛋白,马破伤风免疫球蛋白(F(ab'')2),人凝血因子Ⅷ,复方普萘洛尔咖啡因片,阿普唑仑胶囊,马吲哚片,奥氮平片,氯氮平片,盐酸帕罗西汀片,盐酸舍曲林片,利培酮片,草酸艾司西酞普兰片,富马酸喹硫平片,米氮平片,舒必利片,盐酸多塞平片,奋乃静片,盐酸曲唑酮片,盐酸丁螺环酮片,盐酸度洛西汀肠溶片,氢溴酸西酞普兰片,盐酸文拉法辛缓释胶囊,盐酸文拉法辛缓释片,阿立哌唑片,盐酸氯丙嗪片,枸橼酸坦度螺酮胶囊,盐酸阿米替林片,盐酸度洛西汀肠溶胶囊,盐酸硫必利片,碳酸锂片,阿立哌唑口崩片,盐酸氟西汀片,五氟利多片,盐酸氟西汀胶囊,盐酸文拉法辛胶囊,阿立哌唑口腔崩解片,氟哌噻吨美利曲辛胶囊,马来酸氟伏沙明片,盐酸氯米帕明片,盐酸舍曲林分散片,盐酸氟西汀分散片,氟哌啶醇片,盐酸帕罗西汀肠溶缓释片,盐酸舍曲林胶囊,氨磺必利片,利培酮口腔崩解片,盐酸米安色林片,利培酮口服液,盐酸齐拉西酮胶囊,碳酸锂缓释片,盐酸齐拉西酮片,富马酸喹硫平缓释片,奥氮平口崩片,盐酸文拉法辛片,布南色林片,盐酸哌罗匹隆片,盐酸马普替林片,盐酸安非他酮片,盐酸氟奋乃静片,氯氮平口腔崩解片,盐酸安非他酮缓释片,甲磺酸瑞波西汀片,氢溴酸西酞普兰胶囊,草酸艾司西酞普兰片(百洛特),氢溴酸西酞普兰片(喜太乐),氯氮平分散片,阿立哌唑胶囊,吗氯贝胺片,伊曲康唑胶囊,复方多粘菌素B软膏,盐酸伊曲康唑胶囊,伊曲康唑分散片,注射用醋酸卡泊芬净,注射用亚胺培南西司他丁钠,注射用盐酸万古霉素,伊曲康唑颗粒,注射用米卡芬净钠,注射用替加环素,注射用硫酸多粘菌素B,注射用盐酸头孢吡肟,注射用替考拉宁,注射用亚胺培南-西司他丁钠,伊曲康唑口服液,注射用比阿培南,注射用盐酸去甲万古霉素,科赛斯注射用醋酸卡泊芬净,伊曲康唑注射液,头孢吡肟,头孢匹罗,头孢噻利,亚安培南/西司他丁,美洛培南,帕尼培南/倍他米隆,比阿培南,朵利培南,替加环素,万古霉素,去甲基万古霉素,替考拉宁,多粘菌素,利奈唑烷,卡泊芬净,米卡芬净,伊曲康唑,伊曲康唑（口服剂）,伏利康唑（口服剂）,伏利康唑,伊曲康唑（口服剂、注射剂）,伏利康唑（口服剂、注射剂）,两性霉素B含脂制剂,伊曲康唑胶囊,盐酸伊曲康唑胶囊,伊曲康唑分散片,伊曲康唑颗粒,伊曲康唑口服液,复方多粘菌素B软膏,氟哌噻吨美利曲辛片,复方地西泮片,盐酸多塞平片,奋乃静片,盐酸丁螺环酮片,盐酸文拉法辛缓释胶囊,盐酸文拉法辛缓释片,盐酸氯丙嗪片,枸橼酸坦度螺酮胶囊,盐酸硫必利片,盐酸文拉法辛胶囊,氟哌噻吨美利曲辛胶囊,盐酸文拉法辛片酮康唑胶囊仅测试使用,派甲酯,司可巴比妥,丁丙诺啡,Y-羟丁酸,氯胺酮,马吲哚,三唑仑,异戊巴比妥,格鲁米特,喷他左辛,戊巴比妥,阿普唑仑,巴比妥,氯硝西泮,地西泮,艾司唑仑,氟西泮,劳拉西泮,甲丙氨酯,米达唑仑,硝西泮,奥沙西泮,苯巴比妥,唑吡坦,丁丙诺啡透皮贴剂,布托啡诺及其注射剂,咖啡因,安钠咖,地佐辛及其注射剂,麦角胺咖啡因片,氨酚氢可酮片,曲马多,扎来普隆,佐匹克隆,布苯丙胺,卡西酮,二乙基色胺,二甲氧基安非他明,1,2-二甲基庚基,羟基四氢甲基二苯吡喃,二甲基色胺,二甲氧基乙基安非他明,乙环利定,乙色胺,羟芬胺,麦角二乙胺,乙芬胺,二亚甲基双氧安非他明,麦司卡林,甲卡西酮,甲米雷司,甲羟芬胺,4-甲基硫基安非他明,六氢大麻酚,副甲氧基安非他明,赛洛新,赛洛西宾,咯环利定,二甲氧基甲苯异丙胺,替苯丙胺,替诺环定,四氢大麻酚,三甲氧基安非他明,苯丙胺,氨奈普汀,2,5-二甲氧基-4-溴苯乙胺,右苯丙胺,屈大麻酚,芬乙茶碱,左苯丙胺,左甲苯丙胺,甲氯喹酮,去氧麻黄碱,(1,2-二甲基庚基）羟基四氢甲基二苯吡喃,去氧麻黄碱外消旋体,甲喹酮,哌醋甲酯,苯环利定,芬美曲秦,齐培丙醇,安非拉酮,苄基哌嗪,1-丁基-3-(1-萘甲酰基)吲哚,恰特草,2,5-二甲氧基-4-碘苯乙胺,2,5-二甲氧基苯乙胺,二甲基安非他明,依他喹酮,[1-(5-氟戊基)-1H-吲哚-3- 基](2-碘苯基)甲酮,1-(5-氟戊基)-3-(1-萘甲酰基)-1H-吲哚,γ-羟丁酸,2-(2-甲氧基苯基)-1-(1-戊基-1H-吲哚-3-基)乙酮,亚甲基二氧吡咯戊酮,4-甲基乙卡西酮,4-甲基甲卡西酮,3,4-亚甲二氧基甲卡西酮,莫达非尼,1-戊基-3-(1-萘甲酰基)吲哚,他喷他多,布他比妥,去甲伪麻黄碱,环己巴比妥,氟硝西泮,喷他佐辛,阿米雷司,苄非他明,溴西泮,溴替唑仑,丁巴比妥,卡马西泮,氯氮?,氯巴占,氯拉?酸,氯噻西泮,氯噁唑仑,地洛西泮,乙氯维诺,炔己蚁胺,氯氟?乙酯,乙非他明,芬坎法明,芬普雷司,氟地西泮,哈拉西泮,卤沙唑仑,凯他唑仑,利非他明,氯普唑仑,氯甲西泮,美达西泮,美芬雷司,美索卡,甲苯巴比妥,甲乙哌酮,咪达唑仑,尼美西泮,去甲西泮,奥沙唑仑,匹莫林,苯甲曲秦,芬特明,匹那西泮,哌苯甲醇,普拉西泮,吡咯戊酮,仲丁比妥,替马西泮,四氢西泮,乙烯比妥,阿洛巴比妥,右旋芬氟拉明,芬氟拉明,呋芬雷司,纳布啡及其注射剂,丙己君";
        String mazui = "可卡因,罂粟浓缩物,二氢埃托啡,地芬诺酯,芬太尼,氢可酮,氢吗啡酮,美沙酮,吗啡,吗啡阿托品注射液,阿片,复方樟脑酊,羟考酮,哌替啶,瑞芬太尼,舒芬太尼,蒂巴因,可待因,右丙氧芬,双氢可待因,乙基吗啡,福尔可定,布桂嗪,罂粟壳,醋托啡,乙酰阿法甲基芬太尼,醋美沙多,阿芬太尼,烯丙罗定,阿醋美沙多,阿法美罗定,阿法美沙多,阿法甲基芬太尼,阿法甲基硫代芬太尼,阿法罗定,阿尼利定,苄替啶,苄吗啡,倍醋美沙多,倍他羟基芬太尼,倍他羟基-3-甲基芬太尼,倍他美罗定,倍他美沙多,倍他罗定,贝齐米特,大麻和大麻树脂,氯尼他秦,古柯叶,可多克辛,地索吗啡,右吗拉胺,地恩丙胺,二乙噻丁,地芬诺辛,双氢吗啡,地美沙多,地美庚醇,二甲噻丁,吗苯丁酯,地匹哌酮,羟蒂巴酚,芽子碱,乙甲噻丁,依托尼秦,埃托,大麻和大麻树脂与大麻浸膏和酊,埃托啡,依托利定,呋替啶,海洛因,氢吗啡醇,羟哌替啶,异美沙酮,凯托米酮,左美沙芬,左吗拉胺,左芬啡烷,左啡诺,美他佐辛,美沙酮中间体,甲地索啡,甲二氢吗啡,3-甲基芬太尼,3-甲基硫代芬太尼,美托酮,吗拉胺中间体,吗哌利定,吗啡甲溴化物,吗啡-N-氧化物,1-甲基-4-苯基-4-哌啶丙酸酯,麦罗啡,尼可吗啡,诺美沙多,去甲左啡诺,去甲美沙酮,去甲吗啡,诺匹哌酮,奥列巴文,羟吗啡酮,对氟芬太尼,哌替啶中间体A,哌替啶中间体B,哌替啶中间体C,苯吗庚酮,非那丙胺,非那佐辛,1-苯乙基-4-苯基-4-哌啶乙酸酯,非诺啡烷,苯哌利定,匹米诺定,哌腈米特,普罗庚嗪,丙哌利定,消旋甲啡烷,消旋吗拉胺,消旋啡烷,醋氢可酮,硫代芬太尼,替利定,三甲利定,醋氢可待因,尼可待因,烟氢可待因,去甲可待因,丙吡兰,复方苯巴比妥溴化钠片,安替比林咖啡因片,人血白蛋白,全氟丙烷人血白蛋白微球注射液,注射用亚锡聚合白蛋白,卵白蛋白口服液,乙型肝炎人免疫球蛋白,人免疫球蛋白,冻干乙型肝炎人免疫球蛋白,兔抗人胸腺细胞免疫球蛋白,冻干静注人免疫球蛋白(pH4),抗人T细胞兔免疫球蛋白,冻干静注乙型肝炎人免疫球蛋白(pH4),猪免疫球蛋白口服液,狂犬病人免疫球蛋白,抗人T细胞兔免疫球蛋白,破伤风人免疫球蛋白,静注人免疫球蛋白(pH4),静注人免疫球蛋白,静注乙型肝炎人免疫球蛋白(pH4),外用冻干人凝血酶,凝血酶冻干粉,凝血酶,冻干人凝血酶,冻干人纤维蛋白原,注射用重组人凝血因子Ⅶa,注射用重组人凝血因子Ⅷ,注射用重组人凝血因子Ⅸ,去乙酰毛花苷丙,洋地黄毒苷,毛果芸香碱,水杨酸毒扁豆碱,阿托品,氢溴酸后马托品,氢溴酸东莨菪碱,三氧化二砷,亚砷酸钾,亚砷酸注射液,升贡,士的宁,A型肉毒毒素及其制剂,麦角酸,麻黄素,麦角胺,麦角新碱,伪麻黄素,消旋麻黄素,去甲麻黄素,甲基麻黄素,麻黄浸膏,麻黄浸膏粉,麻黄素类物质,复方苯巴比妥溴化钠片,安替比林咖啡因片,人血白蛋白,全氟丙烷人血白蛋白微球注射液,注射用亚锡聚合白蛋白,卵白蛋白口服液,乙型肝炎人免疫球蛋白,人免疫球蛋白,冻干乙型肝炎人免疫球蛋白,兔抗人胸腺细胞免疫球蛋白,冻干静注人免疫球蛋白(pH4),抗人T细胞兔免疫球蛋白,冻干静注乙型肝炎人免疫球蛋白(pH4),猪免疫球蛋白口服液,狂犬病人免疫球蛋白,抗人T细胞兔免疫球蛋白,破伤风人免疫球蛋白,静注人免疫球蛋白(pH4),静注人免疫球蛋白,静注乙型肝炎人免疫球蛋白(pH4),外用冻干人凝血酶,凝血酶冻干粉,凝血酶,冻干人凝血酶,冻干人纤维蛋白原,注射用重组人凝血因子Ⅶa,注射用重组人凝血因子Ⅷ,注射用重组人凝血因子Ⅸ";

        String result = dupin + "," + jingshen + "," + mazui;

        String[] a = result.split(",");

        Set<String> hh = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            hh.add(a[i]);
        }

        System.out.println(hh.size());
    }
}
