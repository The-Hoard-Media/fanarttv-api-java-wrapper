/**
 * 
 */
package life.thehoard.thirdparty.api.fanarttv.endpoints.tv;

import java.util.List;

import life.thehoard.thirdparty.api.fanarttv.endpoints.ImageLanguageResponse;
import life.thehoard.thirdparty.api.fanarttv.http.GenericJson;

/**
 * TV show object for Gson returned from the Fanart.TV API
 * 
 * @author Michael Haas
 *
 */
public class TV extends GenericJson {
	/**
	 * Name of the TV Show
	 */
	private String name;

	/**
	 * TheTVDB ID of the TV Show
	 */
	private Integer thetvdb_id;

	/**
	 * List of clear logos
	 */
	private List<ImageLanguageResponse> clearlogo;

	/**
	 * List of HD TV logos
	 */
	private List<ImageLanguageResponse> hdtvlogo;

	/**
	 * List of clear art images
	 */
	private List<ImageLanguageResponse> clearart;

	/**
	 * List of show backgrounds
	 */
	private List<ImageLanguageResponse> showbackground;

	/**
	 * List of TV thumbnails
	 */
	private List<ImageLanguageResponse> tvthumb;

	/**
	 * List of season posters
	 */
	private List<ImageLanguageResponse> seasonposter;

	/**
	 * List of season thumbnails
	 */
	private List<ImageLanguageResponse> seasonthumb;

	/**
	 * List of HD clear art images
	 */
	private List<ImageLanguageResponse> hdclearart;

	/**
	 * list of TV banners
	 */
	private List<ImageLanguageResponse> tvbanner;

	/**
	 * List of character art images
	 */
	private List<ImageLanguageResponse> characterart;

	/**
	 * List of TV posters
	 */
	private List<ImageLanguageResponse> tvposter;

	/**
	 * List of season banners
	 */
	private List<ImageLanguageResponse> seasonbanner;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	protected TV setName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * @return the thetvdb_id
	 */
	public Integer getTheTVDBId() {
		return thetvdb_id;
	}

	/**
	 * @param thetvdb_id
	 *            the thetvdb_id to set
	 */
	protected TV setTheTVDBId(Integer thetvdb_id) {
		this.thetvdb_id = thetvdb_id;
		return this;
	}

	/**
	 * @return the clearlogo
	 */
	public List<ImageLanguageResponse> getClearLogos() {
		return clearlogo;
	}

	/**
	 * @param clearlogo
	 *            the clearlogo to set
	 */
	protected TV setClearLogos(List<ImageLanguageResponse> clearlogo) {
		this.clearlogo = clearlogo;
		return this;
	}

	/**
	 * @return the hdtvlogo
	 */
	public List<ImageLanguageResponse> getHDTVLogos() {
		return hdtvlogo;
	}

	/**
	 * @param hdtvlogo
	 *            the hdtvlogo to set
	 */
	protected TV setHDTVLogos(List<ImageLanguageResponse> hdtvlogo) {
		this.hdtvlogo = hdtvlogo;
		return this;
	}

	/**
	 * @return the clearart
	 */
	public List<ImageLanguageResponse> getClearArt() {
		return clearart;
	}

	/**
	 * @param clearart
	 *            the clearart to set
	 */
	protected TV setClearArt(List<ImageLanguageResponse> clearart) {
		this.clearart = clearart;
		return this;
	}

	/**
	 * @return the showbackground
	 */
	public List<ImageLanguageResponse> getShowBackgrounds() {
		return showbackground;
	}

	/**
	 * @param showbackground
	 *            the showbackground to set
	 */
	protected TV setShowBackgrounds(List<ImageLanguageResponse> showbackground) {
		this.showbackground = showbackground;
		return this;
	}

	/**
	 * @return the tvthumb
	 */
	public List<ImageLanguageResponse> getTVThumbs() {
		return tvthumb;
	}

	/**
	 * @param tvthumb
	 *            the tvthumb to set
	 */
	protected TV setTVThumbs(List<ImageLanguageResponse> tvthumb) {
		this.tvthumb = tvthumb;
		return this;
	}

	/**
	 * @return the seasonposter
	 */
	public List<ImageLanguageResponse> getSeasonPosters() {
		return seasonposter;
	}

	/**
	 * @param seasonposter
	 *            the seasonposter to set
	 */
	protected TV setSeasonPosters(List<ImageLanguageResponse> seasonposter) {
		this.seasonposter = seasonposter;
		return this;
	}

	/**
	 * @return the seasonthumb
	 */
	public List<ImageLanguageResponse> getSeasonThumbs() {
		return seasonthumb;
	}

	/**
	 * @param seasonthumb
	 *            the seasonthumb to set
	 */
	protected TV setSeasonThumbs(List<ImageLanguageResponse> seasonthumb) {
		this.seasonthumb = seasonthumb;
		return this;
	}

	/**
	 * @return the hdclearart
	 */
	public List<ImageLanguageResponse> getHDClearArt() {
		return hdclearart;
	}

	/**
	 * @param hdclearart
	 *            the hdclearart to set
	 */
	protected TV setHDClearArt(List<ImageLanguageResponse> hdclearart) {
		this.hdclearart = hdclearart;
		return this;
	}

	/**
	 * @return the tvbanner
	 */
	public List<ImageLanguageResponse> getTVBanners() {
		return tvbanner;
	}

	/**
	 * @param tvbanner
	 *            the tvbanner to set
	 */
	protected TV setTVBanners(List<ImageLanguageResponse> tvbanner) {
		this.tvbanner = tvbanner;
		return this;
	}

	/**
	 * @return the characterart
	 */
	public List<ImageLanguageResponse> getCharacterArt() {
		return characterart;
	}

	/**
	 * @param characterart
	 *            the characterart to set
	 */
	protected TV setCharacterArt(List<ImageLanguageResponse> characterart) {
		this.characterart = characterart;
		return this;
	}

	/**
	 * @return the tvposter
	 */
	public List<ImageLanguageResponse> getTVPosters() {
		return tvposter;
	}

	/**
	 * @param tvposter
	 *            the tvposter to set
	 */
	protected TV setTVPosters(List<ImageLanguageResponse> tvposter) {
		this.tvposter = tvposter;
		return this;
	}

	/**
	 * @return the seasonbanner
	 */
	public List<ImageLanguageResponse> getSeasonBanners() {
		return seasonbanner;
	}

	/**
	 * @param seasonbanner
	 *            the seasonbanner to set
	 */
	protected TV setSeasonBanners(List<ImageLanguageResponse> seasonbanner) {
		this.seasonbanner = seasonbanner;
		return this;
	}
}
