/*
 * Copyright 2017 Michael Haas
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package media.thehoard.thirdparty.api.fanarttv.endpoints.music;

import media.thehoard.thirdparty.api.fanarttv.endpoints.Latest;

/**
 * Latest artist object used for music, adding the UUID from MusicBrainz
 * 
 * @author Michael Haas
 *
 */
public class LatestArtist extends Latest {
	/**
	 * MusicBrainz UUID of the artist that was updated
	 */
	private String id;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	protected LatestArtist setId(String id) {
		this.id = id;
		return this;
	}
}
