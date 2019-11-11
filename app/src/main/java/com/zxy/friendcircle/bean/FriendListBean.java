package com.zxy.friendcircle.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zxy on 2019/11/11 9:36
 * ******************************************
 * * 朋友圈基类
 * ******************************************
 */
public class FriendListBean implements Serializable {
    /**
     * body : {"adminUserId":"3","code":"1000","data":[{"create_time":1572952650,"user_name":"wxid_qybcj5cktelc22","description":"<TimelineObject><id>13194883190614536356<\/id><username>wxid_qybcj5cktelc22<\/username><createTime>1572952650<\/createTime><contentDescShowType>0<\/contentDescShowType><contentDescScene>0<\/contentDescScene><private>0<\/private><contentDesc><![CDATA[test123]]><\/contentDesc><contentattr>0<\/contentattr><sourceUserName><\/sourceUserName><sourceNickName><\/sourceNickName><statisticsData><\/statisticsData><weappInfo><appUserName><\/appUserName><pagePath><\/pagePath><\/weappInfo><canvasInfoXml><\/canvasInfoXml><ContentObject><contentStyle>2<\/contentStyle><contentSubStyle>0<\/contentSubStyle><title><\/title><description><\/description><contentUrl><\/contentUrl><mediaList><\/mediaList><\/ContentObject><actionInfo><appMsg><mediaTagName><\/mediaTagName><messageExt><\/messageExt><messageAction><\/messageAction><\/appMsg><\/actionInfo><statExtStr><\/statExtStr><appInfo><id><\/id><\/appInfo><location poiClassifyId=\"\" poiName=\"\" poiAddress=\"\" poiClassifyType=\"0\" city=\"\"><\/location><publicUserName><\/publicUserName><streamvideo><streamvideourl><\/streamvideourl><streamvideothumburl><\/streamvideothumburl><streamvideoweburl><\/streamvideoweburl><\/streamvideo><\/TimelineObject>","id":"-5251860883095015260","desc":{"id":"13194883190614536356","username":"wxid_qybcj5cktelc22","createTime":"1572952650","contentDescShowType":"0","contentDescScene":"0","contentattr":"0","contentDesc":"test123","weappInfo":{"appUserName":"","pagePath":""},"contentObject":{"contentStyle":"2","contentSubStyle":"0","title":"","description":"","contentUrl":"","mediaList":{"media":null}}},"comment":null,"commentCount":0,"likeCount":0,"withUserCount":0,"nickName":"万能班长"},{"create_time":1572950882,"user_name":"wxid_qybcj5cktelc22","description":"<TimelineObject><id>13194868353229598903<\/id><username>wxid_qybcj5cktelc22<\/username><createTime>1572950882<\/createTime><contentDescShowType>0<\/contentDescShowType><contentDescScene>0<\/contentDescScene><private>0<\/private><contentDesc><![CDATA[123123]]><\/contentDesc><contentattr>0<\/contentattr><sourceUserName><\/sourceUserName><sourceNickName><\/sourceNickName><statisticsData><\/statisticsData><weappInfo><appUserName><\/appUserName><pagePath><\/pagePath><\/weappInfo><canvasInfoXml><\/canvasInfoXml><ContentObject><contentStyle>1<\/contentStyle><contentSubStyle>0<\/contentSubStyle><title><\/title><description><\/description><contentUrl><\/contentUrl><mediaList><media><id>13194868353822896301<\/id><type>2<\/type><title><\/title><description><\/description><private>0<\/private><url type=\"1\">http://szmmsns.qpic.cn/mmsns/BqNYiaEOXXwa2zb3bAHTDvzXxibQj5I8rFTPoFURlt71xuZ8knJSX3JNQJXiazfZTK7MO4FvtjOAXI/0<\/url><thumb type=\"1\">http://szmmsns.qpic.cn/mmsns/BqNYiaEOXXwa2zb3bAHTDvzXxibQj5I8rFTPoFURlt71xuZ8knJSX3JNQJXiazfZTK7MO4FvtjOAXI/0<\/thumb><size height=\"486.0\" width=\"1158.0\" totalSize=\"51539\"><\/size><\/media><\/mediaList><\/ContentObject><actionInfo><appMsg><mediaTagName><\/mediaTagName><messageExt><\/messageExt><messageAction><\/messageAction><\/appMsg><\/actionInfo><statExtStr><\/statExtStr><appInfo><id><\/id><\/appInfo><location poiClassifyId=\"\" poiName=\"\" poiAddress=\"\" poiClassifyType=\"0\" city=\"\"><\/location><publicUserName><\/publicUserName><streamvideo><streamvideourl><\/streamvideourl><streamvideothumburl><\/streamvideothumburl><streamvideoweburl><\/streamvideoweburl><\/streamvideo><\/TimelineObject>","id":"-5251875720479952713","desc":{"id":"13194868353229598903","username":"wxid_qybcj5cktelc22","createTime":"1572950882","contentDescShowType":"0","contentDescScene":"0","contentattr":"0","contentDesc":"123123","weappInfo":{"appUserName":"","pagePath":""},"contentObject":{"contentStyle":"1","contentSubStyle":"0","title":"","description":"","contentUrl":"","mediaList":{"media":[{"type":"2","id":"13194868353822896301","url":"http://szmmsns.qpic.cn/mmsns/BqNYiaEOXXwa2zb3bAHTDvzXxibQj5I8rFTPoFURlt71xuZ8knJSX3JNQJXiazfZTK7MO4FvtjOAXI/0","thumb":"http://szmmsns.qpic.cn/mmsns/BqNYiaEOXXwa2zb3bAHTDvzXxibQj5I8rFTPoFURlt71xuZ8knJSX3JNQJXiazfZTK7MO4FvtjOAXI/0","size":{"height":"486.0","width":"1158.0","totalSize":"51539"},"width":null,"height":null,"totalSize":null}]}}},"comment":null,"commentCount":0,"likeCount":0,"withUserCount":0,"nickName":"万能班长"},{"create_time":1572945124,"user_name":"wxid_qybcj5cktelc22","description":"<TimelineObject><id>13194820053911613601<\/id><username>wxid_qybcj5cktelc22<\/username><createTime>1572945124<\/createTime><contentDescShowType>0<\/contentDescShowType><contentDescScene>0<\/contentDescScene><private>0<\/private><contentDesc><![CDATA[test123]]><\/contentDesc><contentattr>0<\/contentattr><sourceUserName><\/sourceUserName><sourceNickName><\/sourceNickName><statisticsData><\/statisticsData><weappInfo><appUserName><\/appUserName><pagePath><\/pagePath><\/weappInfo><canvasInfoXml><\/canvasInfoXml><ContentObject><contentStyle>2<\/contentStyle><contentSubStyle>0<\/contentSubStyle><title><\/title><description><\/description><contentUrl><\/contentUrl><mediaList><\/mediaList><\/ContentObject><actionInfo><appMsg><mediaTagName><\/mediaTagName><messageExt><\/messageExt><messageAction><\/messageAction><\/appMsg><\/actionInfo><statExtStr><\/statExtStr><appInfo><id><\/id><\/appInfo><location poiClassifyId=\"\" poiName=\"\" poiAddress=\"\" poiClassifyType=\"0\" city=\"\"><\/location><publicUserName><\/publicUserName><streamvideo><streamvideourl><\/streamvideourl><streamvideothumburl><\/streamvideothumburl><streamvideoweburl><\/streamvideoweburl><\/streamvideo><\/TimelineObject>","id":"-5251924019797938015","desc":{"id":"13194820053911613601","username":"wxid_qybcj5cktelc22","createTime":"1572945124","contentDescShowType":"0","contentDescScene":"0","contentattr":"0","contentDesc":"test123","weappInfo":{"appUserName":"","pagePath":""},"contentObject":{"contentStyle":"2","contentSubStyle":"0","title":"","description":"","contentUrl":"","mediaList":{"media":null}}},"comment":null,"commentCount":0,"likeCount":0,"withUserCount":0,"nickName":"万能班长"},{"create_time":1572943650,"user_name":"wxid_qybcj5cktelc22","description":"<TimelineObject><id>13194807688068214968<\/id><username>wxid_qybcj5cktelc22<\/username><createTime>1572943650<\/createTime><contentDescShowType>0<\/contentDescShowType><contentDescScene>0<\/contentDescScene><private>0<\/private><contentDesc><![CDATA[test001]]><\/contentDesc><contentattr>0<\/contentattr><sourceUserName><\/sourceUserName><sourceNickName><\/sourceNickName><statisticsData><\/statisticsData><weappInfo><appUserName><\/appUserName><pagePath><\/pagePath><\/weappInfo><canvasInfoXml><\/canvasInfoXml><ContentObject><contentStyle>2<\/contentStyle><contentSubStyle>0<\/contentSubStyle><title><\/title><description><\/description><contentUrl><\/contentUrl><mediaList><\/mediaList><\/ContentObject><actionInfo><appMsg><mediaTagName><\/mediaTagName><messageExt><\/messageExt><messageAction><\/messageAction><\/appMsg><\/actionInfo><statExtStr><\/statExtStr><appInfo><id><\/id><\/appInfo><location poiClassifyId=\"\" poiName=\"\" poiAddress=\"\" poiClassifyType=\"0\" city=\"\"><\/location><publicUserName><\/publicUserName><streamvideo><streamvideourl><\/streamvideourl><streamvideothumburl><\/streamvideothumburl><streamvideoweburl><\/streamvideoweburl><\/streamvideo><\/TimelineObject>","id":"-5251936385641336648","desc":{"id":"13194807688068214968","username":"wxid_qybcj5cktelc22","createTime":"1572943650","contentDescShowType":"0","contentDescScene":"0","contentattr":"0","contentDesc":"test001","weappInfo":{"appUserName":"","pagePath":""},"contentObject":{"contentStyle":"2","contentSubStyle":"0","title":"","description":"","contentUrl":"","mediaList":{"media":null}}},"comment":null,"commentCount":0,"likeCount":0,"withUserCount":0,"nickName":"万能班长"},{"create_time":1572942627,"user_name":"wxid_qybcj5cktelc22","description":"<TimelineObject><id>13194799105125462190<\/id><username>wxid_qybcj5cktelc22<\/username><createTime>1572942627<\/createTime><contentDescShowType>0<\/contentDescShowType><contentDescScene>0<\/contentDescScene><private>0<\/private><contentDesc><![CDATA[test00006]]><\/contentDesc><contentattr>0<\/contentattr><sourceUserName><\/sourceUserName><sourceNickName><\/sourceNickName><statisticsData><\/statisticsData><weappInfo><appUserName><\/appUserName><pagePath><\/pagePath><\/weappInfo><canvasInfoXml><\/canvasInfoXml><ContentObject><contentStyle>2<\/contentStyle><contentSubStyle>0<\/contentSubStyle><title><\/title><description><\/description><contentUrl><\/contentUrl><mediaList><\/mediaList><\/ContentObject><actionInfo><appMsg><mediaTagName><\/mediaTagName><messageExt><\/messageExt><messageAction><\/messageAction><\/appMsg><\/actionInfo><statExtStr><\/statExtStr><appInfo><id><\/id><\/appInfo><location poiClassifyId=\"\" poiName=\"\" poiAddress=\"\" poiClassifyType=\"0\" city=\"\"><\/location><publicUserName><\/publicUserName><streamvideo><streamvideourl><\/streamvideourl><streamvideothumburl><\/streamvideothumburl><streamvideoweburl><\/streamvideoweburl><\/streamvideo><\/TimelineObject>","id":"-5251944968584089426","desc":{"id":"13194799105125462190","username":"wxid_qybcj5cktelc22","createTime":"1572942627","contentDescShowType":"0","contentDescScene":"0","contentattr":"0","contentDesc":"test00006","weappInfo":{"appUserName":"","pagePath":""},"contentObject":{"contentStyle":"2","contentSubStyle":"0","title":"","description":"","contentUrl":"","mediaList":{"media":null}}},"comment":null,"commentCount":0,"likeCount":0,"withUserCount":0,"nickName":"万能班长"},{"create_time":1572940914,"user_name":"wxid_qybcj5cktelc22","description":"<TimelineObject><id>13194784738370400421<\/id><username>wxid_qybcj5cktelc22<\/username><createTime>1572940914<\/createTime><contentDescShowType>0<\/contentDescShowType><contentDescScene>0<\/contentDescScene><private>0<\/private><contentDesc><![CDATA[test0003]]><\/contentDesc><contentattr>0<\/contentattr><sourceUserName><\/sourceUserName><sourceNickName><\/sourceNickName><statisticsData><\/statisticsData><weappInfo><appUserName><\/appUserName><pagePath><\/pagePath><\/weappInfo><canvasInfoXml><\/canvasInfoXml><ContentObject><contentStyle>2<\/contentStyle><contentSubStyle>0<\/contentSubStyle><title><\/title><description><\/description><contentUrl><\/contentUrl><mediaList><\/mediaList><\/ContentObject><actionInfo><appMsg><mediaTagName><\/mediaTagName><messageExt><\/messageExt><messageAction><\/messageAction><\/appMsg><\/actionInfo><statExtStr><\/statExtStr><appInfo><id><\/id><\/appInfo><location poiClassifyId=\"\" poiName=\"\" poiAddress=\"\" poiClassifyType=\"0\" city=\"\"><\/location><publicUserName><\/publicUserName><streamvideo><streamvideourl><\/streamvideourl><streamvideothumburl><\/streamvideothumburl><streamvideoweburl><\/streamvideoweburl><\/streamvideo><\/TimelineObject>","id":"-5251959335339151195","desc":{"id":"13194784738370400421","username":"wxid_qybcj5cktelc22","createTime":"1572940914","contentDescShowType":"0","contentDescScene":"0","contentattr":"0","contentDesc":"test0003","weappInfo":{"appUserName":"","pagePath":""},"contentObject":{"contentStyle":"2","contentSubStyle":"0","title":"","description":"","contentUrl":"","mediaList":{"media":null}}},"comment":null,"commentCount":0,"likeCount":0,"withUserCount":0,"nickName":"万能班长"},{"create_time":1572936111,"user_name":"wxid_qybcj5cktelc22","description":"<TimelineObject><id>13194744446934331588<\/id><username>wxid_qybcj5cktelc22<\/username><createTime>1572936111<\/createTime><contentDescShowType>0<\/contentDescShowType><contentDescScene>0<\/contentDescScene><private>0<\/private><contentDesc><![CDATA[test]]><\/contentDesc><contentattr>0<\/contentattr><sourceUserName><\/sourceUserName><sourceNickName><\/sourceNickName><statisticsData><\/statisticsData><weappInfo><appUserName><\/appUserName><pagePath><\/pagePath><\/weappInfo><canvasInfoXml><\/canvasInfoXml><ContentObject><contentStyle>2<\/contentStyle><contentSubStyle>0<\/contentSubStyle><title><\/title><description><\/description><contentUrl><\/contentUrl><mediaList><\/mediaList><\/ContentObject><actionInfo><appMsg><mediaTagName><\/mediaTagName><messageExt><\/messageExt><messageAction><\/messageAction><\/appMsg><\/actionInfo><statExtStr><\/statExtStr><appInfo><id><\/id><\/appInfo><location poiClassifyId=\"\" poiName=\"\" poiAddress=\"\" poiClassifyType=\"0\" city=\"\"><\/location><publicUserName><\/publicUserName><streamvideo><streamvideourl><\/streamvideourl><streamvideothumburl><\/streamvideothumburl><streamvideoweburl><\/streamvideoweburl><\/streamvideo><\/TimelineObject>","id":"-5251999626775220028","desc":{"id":"13194744446934331588","username":"wxid_qybcj5cktelc22","createTime":"1572936111","contentDescShowType":"0","contentDescScene":"0","contentattr":"0","contentDesc":"test","weappInfo":{"appUserName":"","pagePath":""},"contentObject":{"contentStyle":"2","contentSubStyle":"0","title":"","description":"","contentUrl":"","mediaList":{"media":null}}},"comment":null,"commentCount":0,"likeCount":0,"withUserCount":0,"nickName":"万能班长"},{"create_time":1571310000,"user_name":"wxid_qybcj5cktelc22","description":"<TimelineObject><id>13181103638097834145<\/id><username>wxid_qybcj5cktelc22<\/username><createTime>1571310000<\/createTime><contentDescShowType>0<\/contentDescShowType><contentDescScene>0<\/contentDescScene><private>0<\/private><contentDesc><![CDATA[测试朋友圈]]><\/contentDesc><contentattr>0<\/contentattr><sourceUserName><\/sourceUserName><sourceNickName><\/sourceNickName><statisticsData><\/statisticsData><weappInfo><appUserName><\/appUserName><pagePath><\/pagePath><\/weappInfo><canvasInfoXml><\/canvasInfoXml><ContentObject><contentStyle>1<\/contentStyle><contentSubStyle>0<\/contentSubStyle><title><\/title><description><\/description><contentUrl><\/contentUrl><mediaList><media><id>13181103638920900792<\/id><type>2<\/type><title><\/title><description><\/description><private>0<\/private><url type=\"1\">http://szmmsns.qpic.cn/mmsns/BqNYiaEOXXwa2zb3bAHTDvy7hQia8AQdhqlic38TbtiaPIVibqDLS4YanqicBLseTew6ZiagYSeWoaOicz0/0<\/url><thumb type=\"1\">http://szmmsns.qpic.cn/mmsns/BqNYiaEOXXwa2zb3bAHTDvy7hQia8AQdhqlic38TbtiaPIVibqDLS4YanqicBLseTew6ZiagYSeWoaOicz0/0<\/thumb><size height=\"486.0\" width=\"1158.0\" totalSize=\"51539\"><\/size><\/media><\/mediaList><\/ContentObject><actionInfo><appMsg><mediaTagName><\/mediaTagName><messageExt><\/messageExt><messageAction><\/messageAction><\/appMsg><\/actionInfo><statExtStr><\/statExtStr><appInfo><id><\/id><\/appInfo><location poiClassifyId=\"\" poiName=\"\" poiAddress=\"\" poiClassifyType=\"0\" city=\"\"><\/location><publicUserName><\/publicUserName><streamvideo><streamvideourl><\/streamvideourl><streamvideothumburl><\/streamvideothumburl><streamvideoweburl><\/streamvideoweburl><\/streamvideo><\/TimelineObject>","id":"-5265640435611717471","desc":{"id":"13181103638097834145","username":"wxid_qybcj5cktelc22","createTime":"1571310000","contentDescShowType":"0","contentDescScene":"0","contentattr":"0","contentDesc":"测试朋友圈","weappInfo":{"appUserName":"","pagePath":""},"contentObject":{"contentStyle":"1","contentSubStyle":"0","title":"","description":"","contentUrl":"","mediaList":{"media":[{"type":"2","id":"13181103638920900792","url":"http://szmmsns.qpic.cn/mmsns/BqNYiaEOXXwa2zb3bAHTDvy7hQia8AQdhqlic38TbtiaPIVibqDLS4YanqicBLseTew6ZiagYSeWoaOicz0/0","thumb":"http://szmmsns.qpic.cn/mmsns/BqNYiaEOXXwa2zb3bAHTDvy7hQia8AQdhqlic38TbtiaPIVibqDLS4YanqicBLseTew6ZiagYSeWoaOicz0/0","size":{"height":"486.0","width":"1158.0","totalSize":"51539"},"width":null,"height":null,"totalSize":null}]}}},"comment":[{"create_time":"1571310015","reply_id":"0","user_name":"wxid_qybcj5cktelc22","nick_name":"万能班长","reply_user_name":"","id":"3","content":"测试"}],"commentCount":1,"likeCount":1,"withUserCount":0,"nickName":"万能班长"},{"create_time":1570281286,"user_name":"wxid_dydk0dqx35un21","description":"<TimelineObject><id><![CDATA[13172474160692560059]]><\/id><username><![CDATA[wxid_dydk0dqx35un21]]><\/username><createTime><![CDATA[1570281286]]><\/createTime><contentDescShowType>0<\/contentDescShowType><contentDescScene>0<\/contentDescScene><private><![CDATA[0]]><\/private><contentDesc><![CDATA[抓住国庆的小尾巴来看一波灯光秀[得意]\n       中国机长看完后不敢坐飞机了[捂脸]\n             但还是感叹祖国的强大[强][强][强]]]><\/contentDesc><contentattr><![CDATA[0]]><\/contentattr><sourceUserName><\/sourceUserName><sourceNickName><\/sourceNickName><statisticsData><\/statisticsData><weappInfo><appUserName><\/appUserName><pagePath><\/pagePath><\/weappInfo><canvasInfoXml><\/canvasInfoXml><location poiAddress=\"外滩\" poiScale=\"0\" city=\"上海\" poiName=\"上海 · 外滩\" latitude=\"31.239462\" poiClickableStatus=\"0\" poiClassifyId=\"qqmap_16993887822051188891\" poiClassifyType=\"1\" longitude=\"121.47903\" poiAddressName=\"外滩\" country=\"中国\"><\/location><ContentObject><contentStyle><![CDATA[1]]><\/contentStyle><contentSubStyle><![CDATA[0]]><\/contentSubStyle><title><\/title><description><\/description><contentUrl><\/contentUrl><mediaList><media><id><![CDATA[13172474160864854180]]><\/id><type><![CDATA[2]]><\/type><title><\/title><description><\/description><private><![CDATA[0]]><\/private><url type=\"1\"><![CDATA[http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzcINT6TUzT8PaeSorMDzsCx/0]]><\/url><thumb type=\"1\"><![CDATA[http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzcINT6TUzT8PaeSorMDzsCx/150]]><\/thumb><size totalSize=\"86399.0\" width=\"1440.0\" height=\"1080.0\"><\/size><\/media><media><id><![CDATA[13172474160867147945]]><\/id><type><![CDATA[2]]><\/type><title><\/title><description><\/description><private><![CDATA[0]]><\/private><url type=\"1\"><![CDATA[http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzfGjGOvKjb6c7lz6JggX57Z/0]]><\/url><thumb type=\"1\"><![CDATA[http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzfGjGOvKjb6c7lz6JggX57Z/150]]><\/thumb><size totalSize=\"106631.0\" width=\"1440.0\" height=\"1080.0\"><\/size><\/media><media><id><![CDATA[13172474160869114042]]><\/id><type><![CDATA[2]]><\/type><title><\/title><description><\/description><private><![CDATA[0]]><\/private><url type=\"1\"><![CDATA[http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzdDOwMxXhrF97GtAQx4Z20m/0]]><\/url><thumb type=\"1\"><![CDATA[http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzdDOwMxXhrF97GtAQx4Z20m/150]]><\/thumb><size totalSize=\"99552.0\" width=\"1440.0\" height=\"1080.0\"><\/size><\/media><media><id><![CDATA[13172474160875602072]]><\/id><type><![CDATA[2]]><\/type><title><\/title><description><\/description><private><![CDATA[0]]><\/private><url type=\"1\"><![CDATA[http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzd9qDvp8UoYCY1pOXEynT43/0]]><\/url><thumb type=\"1\"><![CDATA[http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzd9qDvp8UoYCY1pOXEynT43/150]]><\/thumb><size totalSize=\"75028.0\" width=\"1440.0\" height=\"1080.0\"><\/size><\/media><media><id><![CDATA[13172474160883925164]]><\/id><type><![CDATA[2]]><\/type><title><\/title><description><\/description><private><![CDATA[0]]><\/private><url type=\"1\"><![CDATA[http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzfY2wD8CIaSRsIXRQnHFvsd/0]]><\/url><thumb type=\"1\"><![CDATA[http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzfY2wD8CIaSRsIXRQnHFvsd/150]]><\/thumb><size totalSize=\"141858.0\" width=\"886.0\" height=\"1920.0\"><\/size><\/media><media><id><![CDATA[13172474160886218913]]><\/id><type><![CDATA[2]]><\/type><title><\/title><description><\/description><private><![CDATA[0]]><\/private><url type=\"1\"><![CDATA[http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzeybZtVv8YlvjVcQbMa0H77/0]]><\/url><thumb type=\"1\"><![CDATA[http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzeybZtVv8YlvjVcQbMa0H77/150]]><\/thumb><size totalSize=\"116967.0\" width=\"1440.0\" height=\"1080.0\"><\/size><\/media><media><id><![CDATA[13172474160885563582]]><\/id><type><![CDATA[2]]><\/type><title><\/title><description><\/description><private><![CDATA[0]]><\/private><url type=\"1\"><![CDATA[http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzerapicdhXFnrRt2Fs3kpZFf/0]]><\/url><thumb type=\"1\"><![CDATA[http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzerapicdhXFnrRt2Fs3kpZFf/150]]><\/thumb><size totalSize=\"86399.0\" width=\"1440.0\" height=\"1080.0\"><\/size><\/media><media><id><![CDATA[13172474160898015410]]><\/id><type><![CDATA[2]]><\/type><title><\/title><description><\/description><private><![CDATA[0]]><\/private><url type=\"1\"><![CDATA[http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzd8IysFCS03Ab96iaQYmiciaDT/0]]><\/url><thumb type=\"1\"><![CDATA[http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzd8IysFCS03Ab96iaQYmiciaDT/150]]><\/thumb><size totalSize=\"106631.0\" width=\"1440.0\" height=\"1080.0\"><\/size><\/media><media><id><![CDATA[13172474160899129495]]><\/id><type><![CDATA[2]]><\/type><title><\/title><description><\/description><private><![CDATA[0]]><\/private><url type=\"1\"><![CDATA[http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzfChTXYl7ow2vXIOiaEib5WNl/0]]><\/url><thumb type=\"1\"><![CDATA[http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzfChTXYl7ow2vXIOiaEib5WNl/150]]><\/thumb><size totalSize=\"88931.0\" width=\"1440.0\" height=\"1080.0\"><\/size><\/media><\/mediaList><\/ContentObject><actionInfo><appMsg><mediaTagName><\/mediaTagName><messageExt><\/messageExt><messageAction><\/messageAction><\/appMsg><\/actionInfo><appInfo><id><\/id><\/appInfo><publicUserName><\/publicUserName><streamvideo><streamvideourl><\/streamvideourl><streamvideothumburl><\/streamvideothumburl><streamvideoweburl><\/streamvideoweburl><\/streamvideo><\/TimelineObject>","id":"-5274269913016991557","desc":{"id":"13172474160692560059","username":"wxid_dydk0dqx35un21","createTime":"1570281286","contentDescShowType":"0","contentDescScene":"0","contentattr":"0","contentDesc":"抓住国庆的小尾巴来看一波灯光秀[得意]\n       中国机长看完后不敢坐飞机了[捂脸]\n             但还是感叹祖国的强大[强][强][强]","weappInfo":{"appUserName":"","pagePath":""},"contentObject":{"contentStyle":"1","contentSubStyle":"0","title":"","description":"","contentUrl":"","mediaList":{"media":[{"type":"2","id":"13172474160864854180","url":"http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzcINT6TUzT8PaeSorMDzsCx/0","thumb":"http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzcINT6TUzT8PaeSorMDzsCx/150","size":{"height":"1080.0","width":"1440.0","totalSize":"86399.0"},"width":null,"height":null,"totalSize":null},{"type":"2","id":"13172474160867147945","url":"http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzfGjGOvKjb6c7lz6JggX57Z/0","thumb":"http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzfGjGOvKjb6c7lz6JggX57Z/150","size":{"height":"1080.0","width":"1440.0","totalSize":"106631.0"},"width":null,"height":null,"totalSize":null},{"type":"2","id":"13172474160869114042","url":"http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzdDOwMxXhrF97GtAQx4Z20m/0","thumb":"http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzdDOwMxXhrF97GtAQx4Z20m/150","size":{"height":"1080.0","width":"1440.0","totalSize":"99552.0"},"width":null,"height":null,"totalSize":null},{"type":"2","id":"13172474160875602072","url":"http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzd9qDvp8UoYCY1pOXEynT43/0","thumb":"http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzd9qDvp8UoYCY1pOXEynT43/150","size":{"height":"1080.0","width":"1440.0","totalSize":"75028.0"},"width":null,"height":null,"totalSize":null},{"type":"2","id":"13172474160883925164","url":"http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzfY2wD8CIaSRsIXRQnHFvsd/0","thumb":"http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzfY2wD8CIaSRsIXRQnHFvsd/150","size":{"height":"1920.0","width":"886.0","totalSize":"141858.0"},"width":null,"height":null,"totalSize":null},{"type":"2","id":"13172474160886218913","url":"http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzeybZtVv8YlvjVcQbMa0H77/0","thumb":"http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzeybZtVv8YlvjVcQbMa0H77/150","size":{"height":"1080.0","width":"1440.0","totalSize":"116967.0"},"width":null,"height":null,"totalSize":null},{"type":"2","id":"13172474160885563582","url":"http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzerapicdhXFnrRt2Fs3kpZFf/0","thumb":"http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzerapicdhXFnrRt2Fs3kpZFf/150","size":{"height":"1080.0","width":"1440.0","totalSize":"86399.0"},"width":null,"height":null,"totalSize":null},{"type":"2","id":"13172474160898015410","url":"http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzd8IysFCS03Ab96iaQYmiciaDT/0","thumb":"http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzd8IysFCS03Ab96iaQYmiciaDT/150","size":{"height":"1080.0","width":"1440.0","totalSize":"106631.0"},"width":null,"height":null,"totalSize":null},{"type":"2","id":"13172474160899129495","url":"http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzfChTXYl7ow2vXIOiaEib5WNl/0","thumb":"http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzfChTXYl7ow2vXIOiaEib5WNl/150","size":{"height":"1080.0","width":"1440.0","totalSize":"88931.0"},"width":null,"height":null,"totalSize":null}]}}},"comment":null,"commentCount":0,"likeCount":0,"withUserCount":0,"nickName":"柠檬草的香味"},{"create_time":1569940157,"user_name":"wxid_dydk0dqx35un21","description":"<TimelineObject><id><![CDATA[13169612561860034753]]><\/id><username><![CDATA[wxid_dydk0dqx35un21]]><\/username><createTime><![CDATA[1569940157]]><\/createTime><contentDescShowType>0<\/contentDescShowType><contentDescScene>0<\/contentDescScene><private><![CDATA[0]]><\/private><contentDesc><![CDATA[吃了吐，吐了吃，吐了还得吃]]><\/contentDesc><contentattr><![CDATA[0]]><\/contentattr><sourceUserName><\/sourceUserName><sourceNickName><\/sourceNickName><statisticsData><\/statisticsData><weappInfo><appUserName><\/appUserName><pagePath><\/pagePath><\/weappInfo><canvasInfoXml><\/canvasInfoXml><ContentObject><contentStyle><![CDATA[1]]><\/contentStyle><contentSubStyle><![CDATA[0]]><\/contentSubStyle><title><\/title><description><\/description><contentUrl><\/contentUrl><mediaList><media><id><![CDATA[13169612561961287857]]><\/id><type><![CDATA[2]]><\/type><title><\/title><description><\/description><private><![CDATA[0]]><\/private><url type=\"1\"><![CDATA[http://shmmsns.qpic.cn/mmsns/icFTnRoibgibpicIyyFGjiaM4pZPRRC5kLsRuFZ6DQvGdJqCx7BjXWKc7GmX0rjibxPibcFdOeERUIRJvo/0]]><\/url><thumb type=\"1\"><![CDATA[http://shmmsns.qpic.cn/mmsns/icFTnRoibgibpicIyyFGjiaM4pZPRRC5kLsRuFZ6DQvGdJqCx7BjXWKc7GmX0rjibxPibcFdOeERUIRJvo/150]]><\/thumb><size totalSize=\"236182.0\" width=\"886.0\" height=\"1920.0\"><\/size><\/media><\/mediaList><\/ContentObject><actionInfo><appMsg><mediaTagName><\/mediaTagName><messageExt><\/messageExt><messageAction><\/messageAction><\/appMsg><\/actionInfo><appInfo><id><\/id><\/appInfo><location poiClassifyId=\"\" poiName=\"\" poiAddress=\"\" poiClassifyType=\"0\" city=\"\"><\/location><publicUserName><\/publicUserName><streamvideo><streamvideourl><\/streamvideourl><streamvideothumburl><\/streamvideothumburl><streamvideoweburl><\/streamvideoweburl><\/streamvideo><\/TimelineObject>","id":"-5277131511849516863","desc":{"id":"13169612561860034753","username":"wxid_dydk0dqx35un21","createTime":"1569940157","contentDescShowType":"0","contentDescScene":"0","contentattr":"0","contentDesc":"吃了吐，吐了吃，吐了还得吃","weappInfo":{"appUserName":"","pagePath":""},"contentObject":{"contentStyle":"1","contentSubStyle":"0","title":"","description":"","contentUrl":"","mediaList":{"media":[{"type":"2","id":"13169612561961287857","url":"http://shmmsns.qpic.cn/mmsns/icFTnRoibgibpicIyyFGjiaM4pZPRRC5kLsRuFZ6DQvGdJqCx7BjXWKc7GmX0rjibxPibcFdOeERUIRJvo/0","thumb":"http://shmmsns.qpic.cn/mmsns/icFTnRoibgibpicIyyFGjiaM4pZPRRC5kLsRuFZ6DQvGdJqCx7BjXWKc7GmX0rjibxPibcFdOeERUIRJvo/150","size":{"height":"1920.0","width":"886.0","totalSize":"236182.0"},"width":null,"height":null,"totalSize":null}]}}},"comment":null,"commentCount":0,"likeCount":0,"withUserCount":0,"nickName":"柠檬草的香味"}],"source":"grpc","message":"","userName":"wxid_qybcj5cktelc22","queueName":"queue.receiveSelfSns_webserviceslocal","uin":"2067778508","snsId":"-5251376414246555450","firstPageMd5":"","status":"0","reqTime":"1573108465","mtype":"sendSns","snsObjectsCount":"10"}
     * status : 200
     */

    private BodyBean body;
    private int status;

    public BodyBean getBody() {
        return body;
    }

    public void setBody(BodyBean body) {
        this.body = body;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public static class BodyBean implements Serializable {
        /**
         * adminUserId : 3
         * code : 1000
         * data : [{"create_time":1572952650,"user_name":"wxid_qybcj5cktelc22","description":"<TimelineObject><id>13194883190614536356<\/id><username>wxid_qybcj5cktelc22<\/username><createTime>1572952650<\/createTime><contentDescShowType>0<\/contentDescShowType><contentDescScene>0<\/contentDescScene><private>0<\/private><contentDesc><![CDATA[test123]]><\/contentDesc><contentattr>0<\/contentattr><sourceUserName><\/sourceUserName><sourceNickName><\/sourceNickName><statisticsData><\/statisticsData><weappInfo><appUserName><\/appUserName><pagePath><\/pagePath><\/weappInfo><canvasInfoXml><\/canvasInfoXml><ContentObject><contentStyle>2<\/contentStyle><contentSubStyle>0<\/contentSubStyle><title><\/title><description><\/description><contentUrl><\/contentUrl><mediaList><\/mediaList><\/ContentObject><actionInfo><appMsg><mediaTagName><\/mediaTagName><messageExt><\/messageExt><messageAction><\/messageAction><\/appMsg><\/actionInfo><statExtStr><\/statExtStr><appInfo><id><\/id><\/appInfo><location poiClassifyId=\"\" poiName=\"\" poiAddress=\"\" poiClassifyType=\"0\" city=\"\"><\/location><publicUserName><\/publicUserName><streamvideo><streamvideourl><\/streamvideourl><streamvideothumburl><\/streamvideothumburl><streamvideoweburl><\/streamvideoweburl><\/streamvideo><\/TimelineObject>","id":"-5251860883095015260","desc":{"id":"13194883190614536356","username":"wxid_qybcj5cktelc22","createTime":"1572952650","contentDescShowType":"0","contentDescScene":"0","contentattr":"0","contentDesc":"test123","weappInfo":{"appUserName":"","pagePath":""},"contentObject":{"contentStyle":"2","contentSubStyle":"0","title":"","description":"","contentUrl":"","mediaList":{"media":null}}},"comment":null,"commentCount":0,"likeCount":0,"withUserCount":0,"nickName":"万能班长"},{"create_time":1572950882,"user_name":"wxid_qybcj5cktelc22","description":"<TimelineObject><id>13194868353229598903<\/id><username>wxid_qybcj5cktelc22<\/username><createTime>1572950882<\/createTime><contentDescShowType>0<\/contentDescShowType><contentDescScene>0<\/contentDescScene><private>0<\/private><contentDesc><![CDATA[123123]]><\/contentDesc><contentattr>0<\/contentattr><sourceUserName><\/sourceUserName><sourceNickName><\/sourceNickName><statisticsData><\/statisticsData><weappInfo><appUserName><\/appUserName><pagePath><\/pagePath><\/weappInfo><canvasInfoXml><\/canvasInfoXml><ContentObject><contentStyle>1<\/contentStyle><contentSubStyle>0<\/contentSubStyle><title><\/title><description><\/description><contentUrl><\/contentUrl><mediaList><media><id>13194868353822896301<\/id><type>2<\/type><title><\/title><description><\/description><private>0<\/private><url type=\"1\">http://szmmsns.qpic.cn/mmsns/BqNYiaEOXXwa2zb3bAHTDvzXxibQj5I8rFTPoFURlt71xuZ8knJSX3JNQJXiazfZTK7MO4FvtjOAXI/0<\/url><thumb type=\"1\">http://szmmsns.qpic.cn/mmsns/BqNYiaEOXXwa2zb3bAHTDvzXxibQj5I8rFTPoFURlt71xuZ8knJSX3JNQJXiazfZTK7MO4FvtjOAXI/0<\/thumb><size height=\"486.0\" width=\"1158.0\" totalSize=\"51539\"><\/size><\/media><\/mediaList><\/ContentObject><actionInfo><appMsg><mediaTagName><\/mediaTagName><messageExt><\/messageExt><messageAction><\/messageAction><\/appMsg><\/actionInfo><statExtStr><\/statExtStr><appInfo><id><\/id><\/appInfo><location poiClassifyId=\"\" poiName=\"\" poiAddress=\"\" poiClassifyType=\"0\" city=\"\"><\/location><publicUserName><\/publicUserName><streamvideo><streamvideourl><\/streamvideourl><streamvideothumburl><\/streamvideothumburl><streamvideoweburl><\/streamvideoweburl><\/streamvideo><\/TimelineObject>","id":"-5251875720479952713","desc":{"id":"13194868353229598903","username":"wxid_qybcj5cktelc22","createTime":"1572950882","contentDescShowType":"0","contentDescScene":"0","contentattr":"0","contentDesc":"123123","weappInfo":{"appUserName":"","pagePath":""},"contentObject":{"contentStyle":"1","contentSubStyle":"0","title":"","description":"","contentUrl":"","mediaList":{"media":[{"type":"2","id":"13194868353822896301","url":"http://szmmsns.qpic.cn/mmsns/BqNYiaEOXXwa2zb3bAHTDvzXxibQj5I8rFTPoFURlt71xuZ8knJSX3JNQJXiazfZTK7MO4FvtjOAXI/0","thumb":"http://szmmsns.qpic.cn/mmsns/BqNYiaEOXXwa2zb3bAHTDvzXxibQj5I8rFTPoFURlt71xuZ8knJSX3JNQJXiazfZTK7MO4FvtjOAXI/0","size":{"height":"486.0","width":"1158.0","totalSize":"51539"},"width":null,"height":null,"totalSize":null}]}}},"comment":null,"commentCount":0,"likeCount":0,"withUserCount":0,"nickName":"万能班长"},{"create_time":1572945124,"user_name":"wxid_qybcj5cktelc22","description":"<TimelineObject><id>13194820053911613601<\/id><username>wxid_qybcj5cktelc22<\/username><createTime>1572945124<\/createTime><contentDescShowType>0<\/contentDescShowType><contentDescScene>0<\/contentDescScene><private>0<\/private><contentDesc><![CDATA[test123]]><\/contentDesc><contentattr>0<\/contentattr><sourceUserName><\/sourceUserName><sourceNickName><\/sourceNickName><statisticsData><\/statisticsData><weappInfo><appUserName><\/appUserName><pagePath><\/pagePath><\/weappInfo><canvasInfoXml><\/canvasInfoXml><ContentObject><contentStyle>2<\/contentStyle><contentSubStyle>0<\/contentSubStyle><title><\/title><description><\/description><contentUrl><\/contentUrl><mediaList><\/mediaList><\/ContentObject><actionInfo><appMsg><mediaTagName><\/mediaTagName><messageExt><\/messageExt><messageAction><\/messageAction><\/appMsg><\/actionInfo><statExtStr><\/statExtStr><appInfo><id><\/id><\/appInfo><location poiClassifyId=\"\" poiName=\"\" poiAddress=\"\" poiClassifyType=\"0\" city=\"\"><\/location><publicUserName><\/publicUserName><streamvideo><streamvideourl><\/streamvideourl><streamvideothumburl><\/streamvideothumburl><streamvideoweburl><\/streamvideoweburl><\/streamvideo><\/TimelineObject>","id":"-5251924019797938015","desc":{"id":"13194820053911613601","username":"wxid_qybcj5cktelc22","createTime":"1572945124","contentDescShowType":"0","contentDescScene":"0","contentattr":"0","contentDesc":"test123","weappInfo":{"appUserName":"","pagePath":""},"contentObject":{"contentStyle":"2","contentSubStyle":"0","title":"","description":"","contentUrl":"","mediaList":{"media":null}}},"comment":null,"commentCount":0,"likeCount":0,"withUserCount":0,"nickName":"万能班长"},{"create_time":1572943650,"user_name":"wxid_qybcj5cktelc22","description":"<TimelineObject><id>13194807688068214968<\/id><username>wxid_qybcj5cktelc22<\/username><createTime>1572943650<\/createTime><contentDescShowType>0<\/contentDescShowType><contentDescScene>0<\/contentDescScene><private>0<\/private><contentDesc><![CDATA[test001]]><\/contentDesc><contentattr>0<\/contentattr><sourceUserName><\/sourceUserName><sourceNickName><\/sourceNickName><statisticsData><\/statisticsData><weappInfo><appUserName><\/appUserName><pagePath><\/pagePath><\/weappInfo><canvasInfoXml><\/canvasInfoXml><ContentObject><contentStyle>2<\/contentStyle><contentSubStyle>0<\/contentSubStyle><title><\/title><description><\/description><contentUrl><\/contentUrl><mediaList><\/mediaList><\/ContentObject><actionInfo><appMsg><mediaTagName><\/mediaTagName><messageExt><\/messageExt><messageAction><\/messageAction><\/appMsg><\/actionInfo><statExtStr><\/statExtStr><appInfo><id><\/id><\/appInfo><location poiClassifyId=\"\" poiName=\"\" poiAddress=\"\" poiClassifyType=\"0\" city=\"\"><\/location><publicUserName><\/publicUserName><streamvideo><streamvideourl><\/streamvideourl><streamvideothumburl><\/streamvideothumburl><streamvideoweburl><\/streamvideoweburl><\/streamvideo><\/TimelineObject>","id":"-5251936385641336648","desc":{"id":"13194807688068214968","username":"wxid_qybcj5cktelc22","createTime":"1572943650","contentDescShowType":"0","contentDescScene":"0","contentattr":"0","contentDesc":"test001","weappInfo":{"appUserName":"","pagePath":""},"contentObject":{"contentStyle":"2","contentSubStyle":"0","title":"","description":"","contentUrl":"","mediaList":{"media":null}}},"comment":null,"commentCount":0,"likeCount":0,"withUserCount":0,"nickName":"万能班长"},{"create_time":1572942627,"user_name":"wxid_qybcj5cktelc22","description":"<TimelineObject><id>13194799105125462190<\/id><username>wxid_qybcj5cktelc22<\/username><createTime>1572942627<\/createTime><contentDescShowType>0<\/contentDescShowType><contentDescScene>0<\/contentDescScene><private>0<\/private><contentDesc><![CDATA[test00006]]><\/contentDesc><contentattr>0<\/contentattr><sourceUserName><\/sourceUserName><sourceNickName><\/sourceNickName><statisticsData><\/statisticsData><weappInfo><appUserName><\/appUserName><pagePath><\/pagePath><\/weappInfo><canvasInfoXml><\/canvasInfoXml><ContentObject><contentStyle>2<\/contentStyle><contentSubStyle>0<\/contentSubStyle><title><\/title><description><\/description><contentUrl><\/contentUrl><mediaList><\/mediaList><\/ContentObject><actionInfo><appMsg><mediaTagName><\/mediaTagName><messageExt><\/messageExt><messageAction><\/messageAction><\/appMsg><\/actionInfo><statExtStr><\/statExtStr><appInfo><id><\/id><\/appInfo><location poiClassifyId=\"\" poiName=\"\" poiAddress=\"\" poiClassifyType=\"0\" city=\"\"><\/location><publicUserName><\/publicUserName><streamvideo><streamvideourl><\/streamvideourl><streamvideothumburl><\/streamvideothumburl><streamvideoweburl><\/streamvideoweburl><\/streamvideo><\/TimelineObject>","id":"-5251944968584089426","desc":{"id":"13194799105125462190","username":"wxid_qybcj5cktelc22","createTime":"1572942627","contentDescShowType":"0","contentDescScene":"0","contentattr":"0","contentDesc":"test00006","weappInfo":{"appUserName":"","pagePath":""},"contentObject":{"contentStyle":"2","contentSubStyle":"0","title":"","description":"","contentUrl":"","mediaList":{"media":null}}},"comment":null,"commentCount":0,"likeCount":0,"withUserCount":0,"nickName":"万能班长"},{"create_time":1572940914,"user_name":"wxid_qybcj5cktelc22","description":"<TimelineObject><id>13194784738370400421<\/id><username>wxid_qybcj5cktelc22<\/username><createTime>1572940914<\/createTime><contentDescShowType>0<\/contentDescShowType><contentDescScene>0<\/contentDescScene><private>0<\/private><contentDesc><![CDATA[test0003]]><\/contentDesc><contentattr>0<\/contentattr><sourceUserName><\/sourceUserName><sourceNickName><\/sourceNickName><statisticsData><\/statisticsData><weappInfo><appUserName><\/appUserName><pagePath><\/pagePath><\/weappInfo><canvasInfoXml><\/canvasInfoXml><ContentObject><contentStyle>2<\/contentStyle><contentSubStyle>0<\/contentSubStyle><title><\/title><description><\/description><contentUrl><\/contentUrl><mediaList><\/mediaList><\/ContentObject><actionInfo><appMsg><mediaTagName><\/mediaTagName><messageExt><\/messageExt><messageAction><\/messageAction><\/appMsg><\/actionInfo><statExtStr><\/statExtStr><appInfo><id><\/id><\/appInfo><location poiClassifyId=\"\" poiName=\"\" poiAddress=\"\" poiClassifyType=\"0\" city=\"\"><\/location><publicUserName><\/publicUserName><streamvideo><streamvideourl><\/streamvideourl><streamvideothumburl><\/streamvideothumburl><streamvideoweburl><\/streamvideoweburl><\/streamvideo><\/TimelineObject>","id":"-5251959335339151195","desc":{"id":"13194784738370400421","username":"wxid_qybcj5cktelc22","createTime":"1572940914","contentDescShowType":"0","contentDescScene":"0","contentattr":"0","contentDesc":"test0003","weappInfo":{"appUserName":"","pagePath":""},"contentObject":{"contentStyle":"2","contentSubStyle":"0","title":"","description":"","contentUrl":"","mediaList":{"media":null}}},"comment":null,"commentCount":0,"likeCount":0,"withUserCount":0,"nickName":"万能班长"},{"create_time":1572936111,"user_name":"wxid_qybcj5cktelc22","description":"<TimelineObject><id>13194744446934331588<\/id><username>wxid_qybcj5cktelc22<\/username><createTime>1572936111<\/createTime><contentDescShowType>0<\/contentDescShowType><contentDescScene>0<\/contentDescScene><private>0<\/private><contentDesc><![CDATA[test]]><\/contentDesc><contentattr>0<\/contentattr><sourceUserName><\/sourceUserName><sourceNickName><\/sourceNickName><statisticsData><\/statisticsData><weappInfo><appUserName><\/appUserName><pagePath><\/pagePath><\/weappInfo><canvasInfoXml><\/canvasInfoXml><ContentObject><contentStyle>2<\/contentStyle><contentSubStyle>0<\/contentSubStyle><title><\/title><description><\/description><contentUrl><\/contentUrl><mediaList><\/mediaList><\/ContentObject><actionInfo><appMsg><mediaTagName><\/mediaTagName><messageExt><\/messageExt><messageAction><\/messageAction><\/appMsg><\/actionInfo><statExtStr><\/statExtStr><appInfo><id><\/id><\/appInfo><location poiClassifyId=\"\" poiName=\"\" poiAddress=\"\" poiClassifyType=\"0\" city=\"\"><\/location><publicUserName><\/publicUserName><streamvideo><streamvideourl><\/streamvideourl><streamvideothumburl><\/streamvideothumburl><streamvideoweburl><\/streamvideoweburl><\/streamvideo><\/TimelineObject>","id":"-5251999626775220028","desc":{"id":"13194744446934331588","username":"wxid_qybcj5cktelc22","createTime":"1572936111","contentDescShowType":"0","contentDescScene":"0","contentattr":"0","contentDesc":"test","weappInfo":{"appUserName":"","pagePath":""},"contentObject":{"contentStyle":"2","contentSubStyle":"0","title":"","description":"","contentUrl":"","mediaList":{"media":null}}},"comment":null,"commentCount":0,"likeCount":0,"withUserCount":0,"nickName":"万能班长"},{"create_time":1571310000,"user_name":"wxid_qybcj5cktelc22","description":"<TimelineObject><id>13181103638097834145<\/id><username>wxid_qybcj5cktelc22<\/username><createTime>1571310000<\/createTime><contentDescShowType>0<\/contentDescShowType><contentDescScene>0<\/contentDescScene><private>0<\/private><contentDesc><![CDATA[测试朋友圈]]><\/contentDesc><contentattr>0<\/contentattr><sourceUserName><\/sourceUserName><sourceNickName><\/sourceNickName><statisticsData><\/statisticsData><weappInfo><appUserName><\/appUserName><pagePath><\/pagePath><\/weappInfo><canvasInfoXml><\/canvasInfoXml><ContentObject><contentStyle>1<\/contentStyle><contentSubStyle>0<\/contentSubStyle><title><\/title><description><\/description><contentUrl><\/contentUrl><mediaList><media><id>13181103638920900792<\/id><type>2<\/type><title><\/title><description><\/description><private>0<\/private><url type=\"1\">http://szmmsns.qpic.cn/mmsns/BqNYiaEOXXwa2zb3bAHTDvy7hQia8AQdhqlic38TbtiaPIVibqDLS4YanqicBLseTew6ZiagYSeWoaOicz0/0<\/url><thumb type=\"1\">http://szmmsns.qpic.cn/mmsns/BqNYiaEOXXwa2zb3bAHTDvy7hQia8AQdhqlic38TbtiaPIVibqDLS4YanqicBLseTew6ZiagYSeWoaOicz0/0<\/thumb><size height=\"486.0\" width=\"1158.0\" totalSize=\"51539\"><\/size><\/media><\/mediaList><\/ContentObject><actionInfo><appMsg><mediaTagName><\/mediaTagName><messageExt><\/messageExt><messageAction><\/messageAction><\/appMsg><\/actionInfo><statExtStr><\/statExtStr><appInfo><id><\/id><\/appInfo><location poiClassifyId=\"\" poiName=\"\" poiAddress=\"\" poiClassifyType=\"0\" city=\"\"><\/location><publicUserName><\/publicUserName><streamvideo><streamvideourl><\/streamvideourl><streamvideothumburl><\/streamvideothumburl><streamvideoweburl><\/streamvideoweburl><\/streamvideo><\/TimelineObject>","id":"-5265640435611717471","desc":{"id":"13181103638097834145","username":"wxid_qybcj5cktelc22","createTime":"1571310000","contentDescShowType":"0","contentDescScene":"0","contentattr":"0","contentDesc":"测试朋友圈","weappInfo":{"appUserName":"","pagePath":""},"contentObject":{"contentStyle":"1","contentSubStyle":"0","title":"","description":"","contentUrl":"","mediaList":{"media":[{"type":"2","id":"13181103638920900792","url":"http://szmmsns.qpic.cn/mmsns/BqNYiaEOXXwa2zb3bAHTDvy7hQia8AQdhqlic38TbtiaPIVibqDLS4YanqicBLseTew6ZiagYSeWoaOicz0/0","thumb":"http://szmmsns.qpic.cn/mmsns/BqNYiaEOXXwa2zb3bAHTDvy7hQia8AQdhqlic38TbtiaPIVibqDLS4YanqicBLseTew6ZiagYSeWoaOicz0/0","size":{"height":"486.0","width":"1158.0","totalSize":"51539"},"width":null,"height":null,"totalSize":null}]}}},"comment":[{"create_time":"1571310015","reply_id":"0","user_name":"wxid_qybcj5cktelc22","nick_name":"万能班长","reply_user_name":"","id":"3","content":"测试"}],"commentCount":1,"likeCount":1,"withUserCount":0,"nickName":"万能班长"},{"create_time":1570281286,"user_name":"wxid_dydk0dqx35un21","description":"<TimelineObject><id><![CDATA[13172474160692560059]]><\/id><username><![CDATA[wxid_dydk0dqx35un21]]><\/username><createTime><![CDATA[1570281286]]><\/createTime><contentDescShowType>0<\/contentDescShowType><contentDescScene>0<\/contentDescScene><private><![CDATA[0]]><\/private><contentDesc><![CDATA[抓住国庆的小尾巴来看一波灯光秀[得意]\n       中国机长看完后不敢坐飞机了[捂脸]\n             但还是感叹祖国的强大[强][强][强]]]><\/contentDesc><contentattr><![CDATA[0]]><\/contentattr><sourceUserName><\/sourceUserName><sourceNickName><\/sourceNickName><statisticsData><\/statisticsData><weappInfo><appUserName><\/appUserName><pagePath><\/pagePath><\/weappInfo><canvasInfoXml><\/canvasInfoXml><location poiAddress=\"外滩\" poiScale=\"0\" city=\"上海\" poiName=\"上海 · 外滩\" latitude=\"31.239462\" poiClickableStatus=\"0\" poiClassifyId=\"qqmap_16993887822051188891\" poiClassifyType=\"1\" longitude=\"121.47903\" poiAddressName=\"外滩\" country=\"中国\"><\/location><ContentObject><contentStyle><![CDATA[1]]><\/contentStyle><contentSubStyle><![CDATA[0]]><\/contentSubStyle><title><\/title><description><\/description><contentUrl><\/contentUrl><mediaList><media><id><![CDATA[13172474160864854180]]><\/id><type><![CDATA[2]]><\/type><title><\/title><description><\/description><private><![CDATA[0]]><\/private><url type=\"1\"><![CDATA[http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzcINT6TUzT8PaeSorMDzsCx/0]]><\/url><thumb type=\"1\"><![CDATA[http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzcINT6TUzT8PaeSorMDzsCx/150]]><\/thumb><size totalSize=\"86399.0\" width=\"1440.0\" height=\"1080.0\"><\/size><\/media><media><id><![CDATA[13172474160867147945]]><\/id><type><![CDATA[2]]><\/type><title><\/title><description><\/description><private><![CDATA[0]]><\/private><url type=\"1\"><![CDATA[http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzfGjGOvKjb6c7lz6JggX57Z/0]]><\/url><thumb type=\"1\"><![CDATA[http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzfGjGOvKjb6c7lz6JggX57Z/150]]><\/thumb><size totalSize=\"106631.0\" width=\"1440.0\" height=\"1080.0\"><\/size><\/media><media><id><![CDATA[13172474160869114042]]><\/id><type><![CDATA[2]]><\/type><title><\/title><description><\/description><private><![CDATA[0]]><\/private><url type=\"1\"><![CDATA[http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzdDOwMxXhrF97GtAQx4Z20m/0]]><\/url><thumb type=\"1\"><![CDATA[http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzdDOwMxXhrF97GtAQx4Z20m/150]]><\/thumb><size totalSize=\"99552.0\" width=\"1440.0\" height=\"1080.0\"><\/size><\/media><media><id><![CDATA[13172474160875602072]]><\/id><type><![CDATA[2]]><\/type><title><\/title><description><\/description><private><![CDATA[0]]><\/private><url type=\"1\"><![CDATA[http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzd9qDvp8UoYCY1pOXEynT43/0]]><\/url><thumb type=\"1\"><![CDATA[http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzd9qDvp8UoYCY1pOXEynT43/150]]><\/thumb><size totalSize=\"75028.0\" width=\"1440.0\" height=\"1080.0\"><\/size><\/media><media><id><![CDATA[13172474160883925164]]><\/id><type><![CDATA[2]]><\/type><title><\/title><description><\/description><private><![CDATA[0]]><\/private><url type=\"1\"><![CDATA[http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzfY2wD8CIaSRsIXRQnHFvsd/0]]><\/url><thumb type=\"1\"><![CDATA[http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzfY2wD8CIaSRsIXRQnHFvsd/150]]><\/thumb><size totalSize=\"141858.0\" width=\"886.0\" height=\"1920.0\"><\/size><\/media><media><id><![CDATA[13172474160886218913]]><\/id><type><![CDATA[2]]><\/type><title><\/title><description><\/description><private><![CDATA[0]]><\/private><url type=\"1\"><![CDATA[http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzeybZtVv8YlvjVcQbMa0H77/0]]><\/url><thumb type=\"1\"><![CDATA[http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzeybZtVv8YlvjVcQbMa0H77/150]]><\/thumb><size totalSize=\"116967.0\" width=\"1440.0\" height=\"1080.0\"><\/size><\/media><media><id><![CDATA[13172474160885563582]]><\/id><type><![CDATA[2]]><\/type><title><\/title><description><\/description><private><![CDATA[0]]><\/private><url type=\"1\"><![CDATA[http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzerapicdhXFnrRt2Fs3kpZFf/0]]><\/url><thumb type=\"1\"><![CDATA[http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzerapicdhXFnrRt2Fs3kpZFf/150]]><\/thumb><size totalSize=\"86399.0\" width=\"1440.0\" height=\"1080.0\"><\/size><\/media><media><id><![CDATA[13172474160898015410]]><\/id><type><![CDATA[2]]><\/type><title><\/title><description><\/description><private><![CDATA[0]]><\/private><url type=\"1\"><![CDATA[http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzd8IysFCS03Ab96iaQYmiciaDT/0]]><\/url><thumb type=\"1\"><![CDATA[http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzd8IysFCS03Ab96iaQYmiciaDT/150]]><\/thumb><size totalSize=\"106631.0\" width=\"1440.0\" height=\"1080.0\"><\/size><\/media><media><id><![CDATA[13172474160899129495]]><\/id><type><![CDATA[2]]><\/type><title><\/title><description><\/description><private><![CDATA[0]]><\/private><url type=\"1\"><![CDATA[http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzfChTXYl7ow2vXIOiaEib5WNl/0]]><\/url><thumb type=\"1\"><![CDATA[http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzfChTXYl7ow2vXIOiaEib5WNl/150]]><\/thumb><size totalSize=\"88931.0\" width=\"1440.0\" height=\"1080.0\"><\/size><\/media><\/mediaList><\/ContentObject><actionInfo><appMsg><mediaTagName><\/mediaTagName><messageExt><\/messageExt><messageAction><\/messageAction><\/appMsg><\/actionInfo><appInfo><id><\/id><\/appInfo><publicUserName><\/publicUserName><streamvideo><streamvideourl><\/streamvideourl><streamvideothumburl><\/streamvideothumburl><streamvideoweburl><\/streamvideoweburl><\/streamvideo><\/TimelineObject>","id":"-5274269913016991557","desc":{"id":"13172474160692560059","username":"wxid_dydk0dqx35un21","createTime":"1570281286","contentDescShowType":"0","contentDescScene":"0","contentattr":"0","contentDesc":"抓住国庆的小尾巴来看一波灯光秀[得意]\n       中国机长看完后不敢坐飞机了[捂脸]\n             但还是感叹祖国的强大[强][强][强]","weappInfo":{"appUserName":"","pagePath":""},"contentObject":{"contentStyle":"1","contentSubStyle":"0","title":"","description":"","contentUrl":"","mediaList":{"media":[{"type":"2","id":"13172474160864854180","url":"http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzcINT6TUzT8PaeSorMDzsCx/0","thumb":"http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzcINT6TUzT8PaeSorMDzsCx/150","size":{"height":"1080.0","width":"1440.0","totalSize":"86399.0"},"width":null,"height":null,"totalSize":null},{"type":"2","id":"13172474160867147945","url":"http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzfGjGOvKjb6c7lz6JggX57Z/0","thumb":"http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzfGjGOvKjb6c7lz6JggX57Z/150","size":{"height":"1080.0","width":"1440.0","totalSize":"106631.0"},"width":null,"height":null,"totalSize":null},{"type":"2","id":"13172474160869114042","url":"http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzdDOwMxXhrF97GtAQx4Z20m/0","thumb":"http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzdDOwMxXhrF97GtAQx4Z20m/150","size":{"height":"1080.0","width":"1440.0","totalSize":"99552.0"},"width":null,"height":null,"totalSize":null},{"type":"2","id":"13172474160875602072","url":"http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzd9qDvp8UoYCY1pOXEynT43/0","thumb":"http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzd9qDvp8UoYCY1pOXEynT43/150","size":{"height":"1080.0","width":"1440.0","totalSize":"75028.0"},"width":null,"height":null,"totalSize":null},{"type":"2","id":"13172474160883925164","url":"http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzfY2wD8CIaSRsIXRQnHFvsd/0","thumb":"http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzfY2wD8CIaSRsIXRQnHFvsd/150","size":{"height":"1920.0","width":"886.0","totalSize":"141858.0"},"width":null,"height":null,"totalSize":null},{"type":"2","id":"13172474160886218913","url":"http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzeybZtVv8YlvjVcQbMa0H77/0","thumb":"http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzeybZtVv8YlvjVcQbMa0H77/150","size":{"height":"1080.0","width":"1440.0","totalSize":"116967.0"},"width":null,"height":null,"totalSize":null},{"type":"2","id":"13172474160885563582","url":"http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzerapicdhXFnrRt2Fs3kpZFf/0","thumb":"http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzerapicdhXFnrRt2Fs3kpZFf/150","size":{"height":"1080.0","width":"1440.0","totalSize":"86399.0"},"width":null,"height":null,"totalSize":null},{"type":"2","id":"13172474160898015410","url":"http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzd8IysFCS03Ab96iaQYmiciaDT/0","thumb":"http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzd8IysFCS03Ab96iaQYmiciaDT/150","size":{"height":"1080.0","width":"1440.0","totalSize":"106631.0"},"width":null,"height":null,"totalSize":null},{"type":"2","id":"13172474160899129495","url":"http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzfChTXYl7ow2vXIOiaEib5WNl/0","thumb":"http://mmsns.qpic.cn/mmsns/PiajxSqBRaEJAN7NZVKicgk2hYSLt1BxUiaibjBkAYWjdzfChTXYl7ow2vXIOiaEib5WNl/150","size":{"height":"1080.0","width":"1440.0","totalSize":"88931.0"},"width":null,"height":null,"totalSize":null}]}}},"comment":null,"commentCount":0,"likeCount":0,"withUserCount":0,"nickName":"柠檬草的香味"},{"create_time":1569940157,"user_name":"wxid_dydk0dqx35un21","description":"<TimelineObject><id><![CDATA[13169612561860034753]]><\/id><username><![CDATA[wxid_dydk0dqx35un21]]><\/username><createTime><![CDATA[1569940157]]><\/createTime><contentDescShowType>0<\/contentDescShowType><contentDescScene>0<\/contentDescScene><private><![CDATA[0]]><\/private><contentDesc><![CDATA[吃了吐，吐了吃，吐了还得吃]]><\/contentDesc><contentattr><![CDATA[0]]><\/contentattr><sourceUserName><\/sourceUserName><sourceNickName><\/sourceNickName><statisticsData><\/statisticsData><weappInfo><appUserName><\/appUserName><pagePath><\/pagePath><\/weappInfo><canvasInfoXml><\/canvasInfoXml><ContentObject><contentStyle><![CDATA[1]]><\/contentStyle><contentSubStyle><![CDATA[0]]><\/contentSubStyle><title><\/title><description><\/description><contentUrl><\/contentUrl><mediaList><media><id><![CDATA[13169612561961287857]]><\/id><type><![CDATA[2]]><\/type><title><\/title><description><\/description><private><![CDATA[0]]><\/private><url type=\"1\"><![CDATA[http://shmmsns.qpic.cn/mmsns/icFTnRoibgibpicIyyFGjiaM4pZPRRC5kLsRuFZ6DQvGdJqCx7BjXWKc7GmX0rjibxPibcFdOeERUIRJvo/0]]><\/url><thumb type=\"1\"><![CDATA[http://shmmsns.qpic.cn/mmsns/icFTnRoibgibpicIyyFGjiaM4pZPRRC5kLsRuFZ6DQvGdJqCx7BjXWKc7GmX0rjibxPibcFdOeERUIRJvo/150]]><\/thumb><size totalSize=\"236182.0\" width=\"886.0\" height=\"1920.0\"><\/size><\/media><\/mediaList><\/ContentObject><actionInfo><appMsg><mediaTagName><\/mediaTagName><messageExt><\/messageExt><messageAction><\/messageAction><\/appMsg><\/actionInfo><appInfo><id><\/id><\/appInfo><location poiClassifyId=\"\" poiName=\"\" poiAddress=\"\" poiClassifyType=\"0\" city=\"\"><\/location><publicUserName><\/publicUserName><streamvideo><streamvideourl><\/streamvideourl><streamvideothumburl><\/streamvideothumburl><streamvideoweburl><\/streamvideoweburl><\/streamvideo><\/TimelineObject>","id":"-5277131511849516863","desc":{"id":"13169612561860034753","username":"wxid_dydk0dqx35un21","createTime":"1569940157","contentDescShowType":"0","contentDescScene":"0","contentattr":"0","contentDesc":"吃了吐，吐了吃，吐了还得吃","weappInfo":{"appUserName":"","pagePath":""},"contentObject":{"contentStyle":"1","contentSubStyle":"0","title":"","description":"","contentUrl":"","mediaList":{"media":[{"type":"2","id":"13169612561961287857","url":"http://shmmsns.qpic.cn/mmsns/icFTnRoibgibpicIyyFGjiaM4pZPRRC5kLsRuFZ6DQvGdJqCx7BjXWKc7GmX0rjibxPibcFdOeERUIRJvo/0","thumb":"http://shmmsns.qpic.cn/mmsns/icFTnRoibgibpicIyyFGjiaM4pZPRRC5kLsRuFZ6DQvGdJqCx7BjXWKc7GmX0rjibxPibcFdOeERUIRJvo/150","size":{"height":"1920.0","width":"886.0","totalSize":"236182.0"},"width":null,"height":null,"totalSize":null}]}}},"comment":null,"commentCount":0,"likeCount":0,"withUserCount":0,"nickName":"柠檬草的香味"}]
         * source : grpc
         * message :
         * userName : wxid_qybcj5cktelc22
         * queueName : queue.receiveSelfSns_webserviceslocal
         * uin : 2067778508
         * snsId : -5251376414246555450
         * firstPageMd5 :
         * status : 0
         * reqTime : 1573108465
         * mtype : sendSns
         * snsObjectsCount : 10
         */

        private String adminUserId;
        private String code;
        private String source;
        private String message;
        private String userName;
        private String queueName;
        private String uin;
        private String snsId;
        private String firstPageMd5;
        private String status;
        private String reqTime;
        private String mtype;
        private String snsObjectsCount;
        private List<DataBean> data;

        public String getAdminUserId() {
            return adminUserId;
        }

        public void setAdminUserId(String adminUserId) {
            this.adminUserId = adminUserId;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getQueueName() {
            return queueName;
        }

        public void setQueueName(String queueName) {
            this.queueName = queueName;
        }

        public String getUin() {
            return uin;
        }

        public void setUin(String uin) {
            this.uin = uin;
        }

        public String getSnsId() {
            return snsId;
        }

        public void setSnsId(String snsId) {
            this.snsId = snsId;
        }

        public String getFirstPageMd5() {
            return firstPageMd5;
        }

        public void setFirstPageMd5(String firstPageMd5) {
            this.firstPageMd5 = firstPageMd5;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getReqTime() {
            return reqTime;
        }

        public void setReqTime(String reqTime) {
            this.reqTime = reqTime;
        }

        public String getMtype() {
            return mtype;
        }

        public void setMtype(String mtype) {
            this.mtype = mtype;
        }

        public String getSnsObjectsCount() {
            return snsObjectsCount;
        }

        public void setSnsObjectsCount(String snsObjectsCount) {
            this.snsObjectsCount = snsObjectsCount;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean implements Serializable{
            /**
             * create_time : 1572952650
             * user_name : wxid_qybcj5cktelc22
             * description : <TimelineObject><id>13194883190614536356</id><username>wxid_qybcj5cktelc22</username><createTime>1572952650</createTime><contentDescShowType>0</contentDescShowType><contentDescScene>0</contentDescScene><private>0</private><contentDesc><![CDATA[test123]]></contentDesc><contentattr>0</contentattr><sourceUserName></sourceUserName><sourceNickName></sourceNickName><statisticsData></statisticsData><weappInfo><appUserName></appUserName><pagePath></pagePath></weappInfo><canvasInfoXml></canvasInfoXml><ContentObject><contentStyle>2</contentStyle><contentSubStyle>0</contentSubStyle><title></title><description></description><contentUrl></contentUrl><mediaList></mediaList></ContentObject><actionInfo><appMsg><mediaTagName></mediaTagName><messageExt></messageExt><messageAction></messageAction></appMsg></actionInfo><statExtStr></statExtStr><appInfo><id></id></appInfo><location poiClassifyId="" poiName="" poiAddress="" poiClassifyType="0" city=""></location><publicUserName></publicUserName><streamvideo><streamvideourl></streamvideourl><streamvideothumburl></streamvideothumburl><streamvideoweburl></streamvideoweburl></streamvideo></TimelineObject>
             * id : -5251860883095015260
             * desc : {"id":"13194883190614536356","username":"wxid_qybcj5cktelc22","createTime":"1572952650","contentDescShowType":"0","contentDescScene":"0","contentattr":"0","contentDesc":"test123","weappInfo":{"appUserName":"","pagePath":""},"contentObject":{"contentStyle":"2","contentSubStyle":"0","title":"","description":"","contentUrl":"","mediaList":{"media":null}}}
             * comment : null
             * commentCount : 0
             * likeCount : 0
             * withUserCount : 0
             * nickName : 万能班长
             */

            private int create_time;
            private String user_name;
            private String description;
            private String id;
            private DescBean desc;
            private List<CommentBean> comment;
            private int commentCount;
            private int likeCount;
            private int withUserCount;
            private String nickName;

            public int getCreate_time() {
                return create_time;
            }

            public void setCreate_time(int create_time) {
                this.create_time = create_time;
            }

            public String getUser_name() {
                return user_name;
            }

            public void setUser_name(String user_name) {
                this.user_name = user_name;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public DescBean getDesc() {
                return desc;
            }

            public void setDesc(DescBean desc) {
                this.desc = desc;
            }

            public List<CommentBean> getComment() {
                return comment;
            }

            public void setComment(List<CommentBean> comment) {
                this.comment = comment;
            }

            public int getCommentCount() {
                return commentCount;
            }

            public void setCommentCount(int commentCount) {
                this.commentCount = commentCount;
            }

            public int getLikeCount() {
                return likeCount;
            }

            public void setLikeCount(int likeCount) {
                this.likeCount = likeCount;
            }

            public int getWithUserCount() {
                return withUserCount;
            }

            public void setWithUserCount(int withUserCount) {
                this.withUserCount = withUserCount;
            }

            public String getNickName() {
                return nickName;
            }

            public void setNickName(String nickName) {
                this.nickName = nickName;
            }


            public static class CommentBean implements Serializable {
                private String create_time;
                private String reply_id;
                private String user_name;
                private String nick_name;
                private String reply_user_name;
                private String id;
                private String content;

                public String getCreate_time() {
                    return create_time;
                }

                public void setCreate_time(String create_time) {
                    this.create_time = create_time;
                }

                public String getReply_id() {
                    return reply_id;
                }

                public void setReply_id(String reply_id) {
                    this.reply_id = reply_id;
                }

                public String getUser_name() {
                    return user_name;
                }

                public void setUser_name(String user_name) {
                    this.user_name = user_name;
                }

                public String getNick_name() {
                    return nick_name;
                }

                public void setNick_name(String nick_name) {
                    this.nick_name = nick_name;
                }

                public String getReply_user_name() {
                    return reply_user_name;
                }

                public void setReply_user_name(String reply_user_name) {
                    this.reply_user_name = reply_user_name;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getContent() {
                    return content;
                }

                public void setContent(String content) {
                    this.content = content;
                }
            }

            public static class DescBean implements Serializable{
                /**
                 * id : 13194883190614536356
                 * username : wxid_qybcj5cktelc22
                 * createTime : 1572952650
                 * contentDescShowType : 0
                 * contentDescScene : 0
                 * contentattr : 0
                 * contentDesc : test123
                 * weappInfo : {"appUserName":"","pagePath":""}
                 * contentObject : {"contentStyle":"2","contentSubStyle":"0","title":"","description":"","contentUrl":"","mediaList":{"media":null}}
                 */

                private String id;
                private String username;
                private String createTime;
                private String contentDescShowType;
                private String contentDescScene;
                private String contentattr;
                private String contentDesc;
                private WeappInfoBean weappInfo;
                private ContentObjectBean contentObject;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getUsername() {
                    return username;
                }

                public void setUsername(String username) {
                    this.username = username;
                }

                public String getCreateTime() {
                    return createTime;
                }

                public void setCreateTime(String createTime) {
                    this.createTime = createTime;
                }

                public String getContentDescShowType() {
                    return contentDescShowType;
                }

                public void setContentDescShowType(String contentDescShowType) {
                    this.contentDescShowType = contentDescShowType;
                }

                public String getContentDescScene() {
                    return contentDescScene;
                }

                public void setContentDescScene(String contentDescScene) {
                    this.contentDescScene = contentDescScene;
                }

                public String getContentattr() {
                    return contentattr;
                }

                public void setContentattr(String contentattr) {
                    this.contentattr = contentattr;
                }

                public String getContentDesc() {
                    return contentDesc;
                }

                public void setContentDesc(String contentDesc) {
                    this.contentDesc = contentDesc;
                }

                public WeappInfoBean getWeappInfo() {
                    return weappInfo;
                }

                public void setWeappInfo(WeappInfoBean weappInfo) {
                    this.weappInfo = weappInfo;
                }

                public ContentObjectBean getContentObject() {
                    return contentObject;
                }

                public void setContentObject(ContentObjectBean contentObject) {
                    this.contentObject = contentObject;
                }

                public static class WeappInfoBean implements Serializable {
                    /**
                     * appUserName :
                     * pagePath :
                     */

                    private String appUserName;
                    private String pagePath;

                    public String getAppUserName() {
                        return appUserName;
                    }

                    public void setAppUserName(String appUserName) {
                        this.appUserName = appUserName;
                    }

                    public String getPagePath() {
                        return pagePath;
                    }

                    public void setPagePath(String pagePath) {
                        this.pagePath = pagePath;
                    }
                }

                public static class ContentObjectBean implements Serializable {
                    /**
                     * contentStyle : 2
                     * contentSubStyle : 0
                     * title :
                     * description :
                     * contentUrl :
                     * mediaList : {"media":null}
                     */

                    private String contentStyle;
                    private String contentSubStyle;
                    private String title;
                    private String description;
                    private String contentUrl;
                    private MediaListBean mediaList;

                    public String getContentStyle() {
                        return contentStyle;
                    }

                    public void setContentStyle(String contentStyle) {
                        this.contentStyle = contentStyle;
                    }

                    public String getContentSubStyle() {
                        return contentSubStyle;
                    }

                    public void setContentSubStyle(String contentSubStyle) {
                        this.contentSubStyle = contentSubStyle;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }

                    public String getContentUrl() {
                        return contentUrl;
                    }

                    public void setContentUrl(String contentUrl) {
                        this.contentUrl = contentUrl;
                    }

                    public MediaListBean getMediaList() {
                        return mediaList;
                    }

                    public void setMediaList(MediaListBean mediaList) {
                        this.mediaList = mediaList;
                    }

                    public static class MediaListBean implements Serializable {
                        /**
                         * media : null
                         */

                        private List<Media> media;

                        public static class Media implements Serializable {
                            private String type;
                            private String id;
                            private String url;
                            private String thumb;
                            private String size;

                            public String getType() {
                                return type;
                            }

                            public void setType(String type) {
                                this.type = type;
                            }

                            public String getId() {
                                return id;
                            }

                            public void setId(String id) {
                                this.id = id;
                            }

                            public String getUrl() {
                                return url;
                            }

                            public void setUrl(String url) {
                                this.url = url;
                            }

                            public String getThumb() {
                                return thumb;
                            }

                            public void setThumb(String thumb) {
                                this.thumb = thumb;
                            }

                            public String getSize() {
                                return size;
                            }

                            public void setSize(String size) {
                                this.size = size;
                            }
                        }

                        public List<Media> getMedia() {
                            return media;
                        }

                        public void setMedia(List<Media> media) {
                            this.media = media;
                        }
                    }
                }
            }
        }
    }
}
