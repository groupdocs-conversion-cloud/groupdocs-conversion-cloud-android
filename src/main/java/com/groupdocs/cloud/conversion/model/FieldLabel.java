/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="FieldLabel.java">
 *   Copyright (c) 2003-2022 Aspose Pty Ltd
 * </copyright>
 * <summary>
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package com.groupdocs.cloud.conversion.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents field label 
 */
@ApiModel(description = "Represents field label ")
public class FieldLabel {
  /**
   * The field name
   */
  @JsonAdapter(FieldEnum.Adapter.class)
  public enum FieldEnum {
    START("Start"),
    
    TABFIELD("TabField"),
    
    SUBJECT("Subject"),
    
    SHOWTIMEAS("ShowTimeAs"),
    
    SENT("Sent"),
    
    REQUIREDATTENDEES("RequiredAttendees"),
    
    RECURRENCEPATTERN("RecurrencePattern"),
    
    RECURRENCE("Recurrence"),
    
    PAGEHEADER("PageHeader"),
    
    ORGANIZER("Organizer"),
    
    LOCATION("Location"),
    
    IMPORTANCE("Importance"),
    
    FROM("From"),
    
    END("End"),
    
    BCC("Bcc"),
    
    ATTACHMENTS("Attachments"),
    
    TO("To");

    private String value;

    FieldEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FieldEnum fromValue(String text) {
      for (FieldEnum b : FieldEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FieldEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FieldEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FieldEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FieldEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("field")
  private FieldEnum field = null;

  @SerializedName("label")
  private String label = null;

  public FieldLabel field(FieldEnum field) {
    this.field = field;
    return this;
  }

   /**
   * The field name
   * @return field
  **/
  @ApiModelProperty(required = true, value = "The field name")
  public FieldEnum getField() {
    return field;
  }

  public void setField(FieldEnum field) {
    this.field = field;
  }

  public FieldLabel label(String label) {
    this.label = label;
    return this;
  }

   /**
   * The label e.g. \&quot;Sender\&quot;
   * @return label
  **/
  @ApiModelProperty(value = "The label e.g. \"Sender\"")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldLabel fieldLabel = (FieldLabel) o;
    return Objects.equals(this.field, fieldLabel.field) &&
        Objects.equals(this.label, fieldLabel.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, label);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldLabel {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

