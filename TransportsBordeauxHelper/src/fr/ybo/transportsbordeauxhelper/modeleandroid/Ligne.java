/*
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package fr.ybo.transportsbordeauxhelper.modeleandroid;

import java.io.Serializable;

import fr.ybo.moteurcsv.adapter.AdapterInteger;
import fr.ybo.moteurcsv.annotation.BaliseCsv;
import fr.ybo.moteurcsv.annotation.FichierCsv;

@SuppressWarnings({"serial"})
@FichierCsv("lignes.txt")
public class Ligne implements Serializable {

	@BaliseCsv(value = "id", ordre = 1)
	public String id;
	@BaliseCsv(value = "nom_court", ordre = 2)
	public String nomCourt;
	@BaliseCsv(value = "nom_long", ordre = 3)
	public String nomLong;
	@BaliseCsv(value = "ordre", adapter = AdapterInteger.class, ordre = 4)
	public Integer ordre;
}