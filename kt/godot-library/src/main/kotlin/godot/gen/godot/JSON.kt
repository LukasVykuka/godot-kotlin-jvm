// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Helper class for creating and parsing JSON data.
 *
 * The [JSON] enables all data types to be converted to and from a JSON string. This useful for serializing data to save to a file or send over the network.
 *
 * [stringify] is used to convert any data type into a JSON string.
 *
 * [parse] is used to convert any existing JSON data into a [Variant] that can be used within Godot. If successfully parsed, use [data] to retrieve the [Variant], and use `typeof` to check if the Variant's type is what you expect. JSON Objects are converted into a [godot.core.Dictionary], but JSON data can be used to store [godot.Array]s, numbers, [godot.String]s and even just a boolean.
 *
 * **Example**
 *
 * ```
 * 		var data_to_send = ["a", "b", "c"]
 * 		var json_string = JSON.stringify(data_to_send)
 * 		# Save data
 * 		# ...
 * 		# Retrieve data
 * 		var error = json.parse(json_string)
 * 		if error == OK:
 * 		    var data_received = json.data
 * 		    if typeof(data_received) == TYPE_ARRAY:
 * 		        print(data_received) # Prints array
 * 		    else:
 * 		        print("Unexpected data")
 * 		else:
 * 		    print("JSON Parse Error: ", json.get_error_message(), " in ", json_string, " at line ", json.get_error_line())
 * 		```
 *
 * Alternatively, you can parse string using the static [parseString] method, but it doesn't allow to handle errors.
 *
 * ```
 * 		var data = JSON.parse_string(json_string) # Returns null if parsing failed.
 * 		```
 *
 * **Note:** Both parse methods do not fully comply with the JSON specification:
 *
 * - Trailing commas in arrays or objects are ignored, instead of causing a parser error.
 *
 * - New line and tab characters are accepted in string literals, and are treated like their corresponding escape sequences `\n` and `\t`.
 *
 * - Numbers are parsed using [godot.String.toFloat] which is generally more lax than the JSON specification.
 *
 * - Certain errors, such as invalid Unicode sequences, do not cause a parser error. Instead, the string is cleansed and an error is logged to the console.
 */
@GodotBaseType
public open class JSON : RefCounted() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_JSON)
  }

  /**
   * Converts a [Variant] var to JSON text and returns the result. Useful for serializing data to store or send over the network.
   *
   * **Note:** The JSON specification does not define integer or float types, but only a *number* type. Therefore, converting a Variant to JSON text will convert all numerical values to [float] types.
   *
   * **Note:** If [fullPrecision] is `true`, when stringifying floats, the unreliable digits are stringified in addition to the reliable digits to guarantee exact decoding.
   *
   * The [indent] parameter controls if and how something is indented, the string used for this parameter will be used where there should be an indent in the output, even spaces like `"   "` will work. `\t` and `\n` can also be used for a tab indent, or to make a newline for each indent respectively.
   *
   * **Example output:**
   *
   * ```
   * 				## JSON.stringify(my_dictionary)
   * 				{"name":"my_dictionary","version":"1.0.0","entities":[{"name":"entity_0","value":"value_0"},{"name":"entity_1","value":"value_1"}]}
   *
   * 				## JSON.stringify(my_dictionary, "\t")
   * 				{
   * 				    "name": "my_dictionary",
   * 				    "version": "1.0.0",
   * 				    "entities": [
   * 				        {
   * 				            "name": "entity_0",
   * 				            "value": "value_0"
   * 				        },
   * 				        {
   * 				            "name": "entity_1",
   * 				            "value": "value_1"
   * 				        }
   * 				    ]
   * 				}
   *
   * 				## JSON.stringify(my_dictionary, "...")
   * 				{
   * 				..."name": "my_dictionary",
   * 				..."version": "1.0.0",
   * 				..."entities": [
   * 				......{
   * 				........."name": "entity_0",
   * 				........."value": "value_0"
   * 				......},
   * 				......{
   * 				........."name": "entity_1",
   * 				........."value": "value_1"
   * 				......}
   * 				...]
   * 				}
   * 				```
   */
  public fun stringify(
    `data`: Any,
    indent: String = "",
    sortKeys: Boolean = true,
    fullPrecision: Boolean = false
  ): String {
    TransferContext.writeArguments(ANY to data, STRING to indent, BOOL to sortKeys, BOOL to fullPrecision)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JSON_STRINGIFY, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Attempts to parse the [jsonString] provided.
   *
   * Returns an [enum Error]. If the parse was successful, it returns [OK] and the result can be retrieved using [data]. If unsuccessful, use [getErrorLine] and [getErrorMessage] for identifying the source of the failure.
   *
   * Non-static variant of [parseString], if you want custom error handling.
   */
  public fun parse(jsonString: String): GodotError {
    TransferContext.writeArguments(STRING to jsonString)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JSON_PARSE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun getData(): Any? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JSON_GET_DATA, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns `0` if the last call to [parse] was successful, or the line number where the parse failed.
   */
  public fun getErrorLine(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JSON_GET_ERROR_LINE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns an empty string if the last call to [parse] was successful, or the error message if it failed.
   */
  public fun getErrorMessage(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JSON_GET_ERROR_MESSAGE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  public companion object
}
