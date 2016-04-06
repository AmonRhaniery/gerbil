/**
 * This file is part of General Entity Annotator Benchmark.
 *
 * General Entity Annotator Benchmark is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * General Entity Annotator Benchmark is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with General Entity Annotator Benchmark.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.aksw.gerbil.datatypes;

import java.util.List;

import org.aksw.gerbil.transfer.nif.TypingInfo;
import org.aksw.gerbil.transfer.nif.data.NamedEntity;

@Deprecated
public class TypeExtractionResult {

    public List<NamedEntity> types;
    public TypingInfo typeInfo;

    public TypeExtractionResult(List<NamedEntity> types, TypingInfo typeInfo) {
        super();
        this.types = types;
        this.typeInfo = typeInfo;
    }

}
