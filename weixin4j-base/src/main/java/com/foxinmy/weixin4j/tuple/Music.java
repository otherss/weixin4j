package com.foxinmy.weixin4j.tuple;

import javax.xml.bind.annotation.XmlElement;

import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;

/**
 * 音乐对象
 * <p>
 * <font color="red">可用于「客服消息」</font>
 * </p>
 * 
 * @className Music
 * @author jy
 * @date 2014年9月29日
 * @since JDK 1.7
 * @see
 */
public class Music implements NotifyTuple {

	private static final long serialVersionUID = -5952134916367253297L;

	@Override
	public String getMessageType() {
		return "music";
	}

	/**
	 * 音乐标题
	 */
	@XmlElement(name = "Title")
	private String title;
	/**
	 * 音乐描述
	 */
	@JSONField(name = "description")
	@XmlElement(name = "Description")
	private String desc;
	/**
	 * 音乐链接
	 */
	@JSONField(name = "music_url")
	@XmlElement(name = "MusicUrl")
	private String musicUrl;
	/**
	 * 高质量音乐链接，WIFI环境优先使用该链接播放音乐
	 */
	@JSONField(name = "hq_music_url")
	@XmlElement(name = "HQMusicUrl")
	private String hqMusicUrl;
	/**
	 * 缩略图的媒体id，通过上传多媒体文件，得到的id
	 */
	@JSONField(name = "thumb_media_id")
	@XmlElement(name = "ThumbMediaId")
	private String thumbMediaId;

	@JSONCreator
	public Music(@JSONField(name = "thumb_media_id") String thumbMediaId) {
		this.thumbMediaId = thumbMediaId;
	}

	public Music(@JSONField(name = "title") String title,
			@JSONField(name = "description") String desc,
			@JSONField(name = "music_url") String musicUrl,
			@JSONField(name = "hq_music_url") String hqMusicUrl,
			@JSONField(name = "thumb_media_id") String thumbMediaId) {
		this.title = title;
		this.desc = desc;
		this.musicUrl = musicUrl;
		this.hqMusicUrl = hqMusicUrl;
		this.thumbMediaId = thumbMediaId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getMusicUrl() {
		return musicUrl;
	}

	public void setMusicUrl(String musicUrl) {
		this.musicUrl = musicUrl;
	}

	public String getHqMusicUrl() {
		return hqMusicUrl;
	}

	public void setHqMusicUrl(String hqMusicUrl) {
		this.hqMusicUrl = hqMusicUrl;
	}

	public String getThumbMediaId() {
		return thumbMediaId;
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", desc=" + desc + ", musicUrl="
				+ musicUrl + ", hqMusicUrl=" + hqMusicUrl + ", thumbMediaId="
				+ thumbMediaId + "]";
	}
}
