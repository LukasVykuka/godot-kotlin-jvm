// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.PackedStringArray
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Provides access to common operating system functionalities.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/677](https://godotengine.org/asset-library/asset/677)
 *
 * This class wraps the most common functionalities for communicating with the host operating system, such as the video driver, delays, environment variables, execution of binaries, command line, etc.
 *
 * **Note:** In Godot 4, [OS] functions related to window management were moved to the [godot.DisplayServer] singleton.
 */
@GodotBaseType
public object OS : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_OS)
    return false
  }

  /**
   * Returns an array of MIDI device names.
   *
   * The returned array will be empty if the system MIDI driver has not previously been initialized with [openMidiInputs].
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  public fun getConnectedMidiInputs(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectedMidiInputsPtr,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Initializes the singleton for the system MIDI driver.
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  public fun openMidiInputs(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.openMidiInputsPtr, NIL)
  }

  /**
   * Shuts down system MIDI driver.
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  public fun closeMidiInputs(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.closeMidiInputsPtr, NIL)
  }

  /**
   * Displays a modal dialog box using the host OS' facilities. Execution is blocked until the dialog is closed.
   */
  @JvmOverloads
  public fun alert(text: String, title: String = "Alert!"): Unit {
    TransferContext.writeArguments(STRING to text, STRING to title)
    TransferContext.callMethod(rawPtr, MethodBindings.alertPtr, NIL)
  }

  /**
   * Crashes the engine (or the editor if called within a `@tool` script). This should *only* be used for testing the system's crash handler, not for any other purpose. For general error reporting, use (in order of preference) [@GDScript.assert], [@GlobalScope.pushError] or [alert]. See also [kill].
   */
  public fun crash(message: String): Unit {
    TransferContext.writeArguments(STRING to message)
    TransferContext.callMethod(rawPtr, MethodBindings.crashPtr, NIL)
  }

  public fun setLowProcessorUsageMode(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setLowProcessorUsageModePtr, NIL)
  }

  public fun isInLowProcessorUsageMode(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isInLowProcessorUsageModePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setLowProcessorUsageModeSleepUsec(usec: Int): Unit {
    TransferContext.writeArguments(LONG to usec.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setLowProcessorUsageModeSleepUsecPtr, NIL)
  }

  public fun getLowProcessorUsageModeSleepUsec(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLowProcessorUsageModeSleepUsecPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setDeltaSmoothing(deltaSmoothingEnabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to deltaSmoothingEnabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setDeltaSmoothingPtr, NIL)
  }

  public fun isDeltaSmoothingEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isDeltaSmoothingEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the number of *logical* CPU cores available on the host machine. On CPUs with HyperThreading enabled, this number will be greater than the number of *physical* CPU cores.
   */
  public fun getProcessorCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getProcessorCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the name of the CPU model on the host machine (e.g. "Intel(R) Core(TM) i7-6700K CPU @ 4.00GHz").
   *
   * **Note:** This method is only implemented on Windows, macOS, Linux and iOS. On Android and Web, [getProcessorName] returns an empty string.
   */
  public fun getProcessorName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getProcessorNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns list of font family names available.
   *
   * **Note:** This method is implemented on Android, iOS, Linux, macOS and Windows.
   */
  public fun getSystemFonts(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSystemFontsPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Returns path to the system font file with [fontName] and style. Returns empty string if no matching fonts found.
   *
   * The following aliases can be used to request default fonts: "sans-serif", "serif", "monospace", "cursive", and "fantasy".
   *
   * **Note:** Returned font might have different style if the requested style is not available.
   *
   * **Note:** This method is implemented on Android, iOS, Linux, macOS and Windows.
   */
  @JvmOverloads
  public fun getSystemFontPath(
    fontName: String,
    weight: Int = 400,
    stretch: Int = 100,
    italic: Boolean = false,
  ): String {
    TransferContext.writeArguments(STRING to fontName, LONG to weight.toLong(), LONG to stretch.toLong(), BOOL to italic)
    TransferContext.callMethod(rawPtr, MethodBindings.getSystemFontPathPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns an array of the system substitute font file paths, which are similar to the font with [fontName] and style for the specified text, locale and script. Returns empty array if no matching fonts found.
   *
   * The following aliases can be used to request default fonts: "sans-serif", "serif", "monospace", "cursive", and "fantasy".
   *
   * **Note:** Depending on OS, it's not guaranteed that any of the returned fonts will be suitable for rendering specified text. Fonts should be loaded and checked in the order they are returned, and the first suitable one used.
   *
   * **Note:** Returned fonts might have different style if the requested style is not available or belong to a different font family.
   *
   * **Note:** This method is implemented on Android, iOS, Linux, macOS and Windows.
   */
  @JvmOverloads
  public fun getSystemFontPathForText(
    fontName: String,
    text: String,
    locale: String = "",
    script: String = "",
    weight: Int = 400,
    stretch: Int = 100,
    italic: Boolean = false,
  ): PackedStringArray {
    TransferContext.writeArguments(STRING to fontName, STRING to text, STRING to locale, STRING to script, LONG to weight.toLong(), LONG to stretch.toLong(), BOOL to italic)
    TransferContext.callMethod(rawPtr, MethodBindings.getSystemFontPathForTextPtr,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Returns the path to the current engine executable.
   *
   * **Note:** On macOS, always use [createInstance] instead of relying on executable path.
   */
  public fun getExecutablePath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getExecutablePathPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Reads a user input string from the standard input (usually the terminal). This operation is *blocking*, which causes the window to freeze if [readStringFromStdin] is called on the main thread. The thread calling [readStringFromStdin] will block until the program receives a line break in standard input (usually by the user pressing [kbd]Enter[/kbd]).
   *
   * **Note:** This method is implemented on Linux, macOS and Windows.
   */
  public fun readStringFromStdin(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.readStringFromStdinPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Executes a command. The file specified in [path] must exist and be executable. Platform path resolution will be used. The [arguments] are used in the given order, separated by spaces, and wrapped in quotes. If an [output] [godot.Array] is provided, the complete shell output of the process will be appended as a single [godot.String] element in [output]. If [readStderr] is `true`, the output to the standard error stream will be included too.
   *
   * On Windows, if [openConsole] is `true` and the process is a console app, a new terminal window will be opened. This is ignored on other platforms.
   *
   * If the command is successfully executed, the method will return the exit code of the command, or `-1` if it fails.
   *
   * **Note:** The Godot thread will pause its execution until the executed command terminates. Use [godot.Thread] to create a separate thread that will not pause the Godot thread, or use [createProcess] to create a completely independent process.
   *
   * For example, to retrieve a list of the working directory's contents:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var output = []
   *
   * var exit_code = OS.execute("ls", ["-l", "/tmp"], output)
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * var output = new Godot.Collections.Array();
   *
   * int exitCode = OS.Execute("ls", new string[] {"-l", "/tmp"}, output);
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * If you wish to access a shell built-in or execute a composite command, a platform-specific shell can be invoked. For example:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var output = []
   *
   * OS.execute("CMD.exe", ["/C", "cd %TEMP% && dir"], output)
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * var output = new Godot.Collections.Array();
   *
   * OS.Execute("CMD.exe", new string[] {"/C", "cd %TEMP% && dir"}, output);
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * **Note:** This method is implemented on Android, iOS, Linux, macOS and Windows.
   *
   * **Note:** To execute a Windows command interpreter built-in command, specify `cmd.exe` in [path], `/c` as the first argument, and the desired command as the second argument.
   *
   * **Note:** To execute a PowerShell built-in command, specify `powershell.exe` in [path], `-Command` as the first argument, and the desired command as the second argument.
   *
   * **Note:** To execute a Unix shell built-in command, specify shell executable name in [path], `-c` as the first argument, and the desired command as the second argument.
   *
   * **Note:** On macOS, sandboxed applications are limited to run only embedded helper executables, specified during export.
   */
  @JvmOverloads
  public fun execute(
    path: String,
    arguments: PackedStringArray,
    output: VariantArray<Any?> = godot.core.variantArrayOf(),
    readStderr: Boolean = false,
    openConsole: Boolean = false,
  ): Int {
    TransferContext.writeArguments(STRING to path, PACKED_STRING_ARRAY to arguments, ARRAY to output, BOOL to readStderr, BOOL to openConsole)
    TransferContext.callMethod(rawPtr, MethodBindings.executePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Creates a new process that runs independently of Godot. It will not terminate if Godot terminates. The path specified in [path] must exist and be executable file or macOS .app bundle. Platform path resolution will be used. The [arguments] are used in the given order and separated by a space.
   *
   * On Windows, if [openConsole] is `true` and the process is a console app, a new terminal window will be opened. This is ignored on other platforms.
   *
   * If the process creation succeeds, the method will return the new process ID, which you can use to monitor the process (and potentially terminate it with [kill]). If the process creation fails, the method will return `-1`.
   *
   * For example, running another instance of the project:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var pid = OS.create_process(OS.get_executable_path(), [])
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * var pid = OS.CreateProcess(OS.GetExecutablePath(), new string[] {});
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * See [execute] if you wish to run an external command and retrieve the results.
   *
   * **Note:** This method is implemented on Android, iOS, Linux, macOS and Windows.
   *
   * **Note:** On macOS, sandboxed applications are limited to run only embedded helper executables, specified during export or system .app bundle, system .app bundles will ignore arguments.
   */
  @JvmOverloads
  public fun createProcess(
    path: String,
    arguments: PackedStringArray,
    openConsole: Boolean = false,
  ): Int {
    TransferContext.writeArguments(STRING to path, PACKED_STRING_ARRAY to arguments, BOOL to openConsole)
    TransferContext.callMethod(rawPtr, MethodBindings.createProcessPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Creates a new instance of Godot that runs independently. The [arguments] are used in the given order and separated by a space.
   *
   * If the process creation succeeds, the method will return the new process ID, which you can use to monitor the process (and potentially terminate it with [kill]). If the process creation fails, the method will return `-1`.
   *
   * **Note:** This method is implemented on Android, iOS, Linux, macOS and Windows.
   */
  public fun createInstance(arguments: PackedStringArray): Int {
    TransferContext.writeArguments(PACKED_STRING_ARRAY to arguments)
    TransferContext.callMethod(rawPtr, MethodBindings.createInstancePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Kill (terminate) the process identified by the given process ID ([pid]), e.g. the one returned by [execute] in non-blocking mode. See also [crash].
   *
   * **Note:** This method can also be used to kill processes that were not spawned by the game.
   *
   * **Note:** This method is implemented on Android, iOS, Linux, macOS and Windows.
   */
  public fun kill(pid: Int): GodotError {
    TransferContext.writeArguments(LONG to pid.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.killPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Requests the OS to open a resource with the most appropriate program. For example:
   *
   * - `OS.shell_open("C:\\Users\name\Downloads")` on Windows opens the file explorer at the user's Downloads folder.
   *
   * - `OS.shell_open("https://godotengine.org")` opens the default web browser on the official Godot website.
   *
   * - `OS.shell_open("mailto:example@example.com")` opens the default email client with the "To" field set to `example@example.com`. See [godot.RFC 2368 - The `mailto` URL scheme](https://datatracker.ietf.org/doc/html/rfc2368) for a list of fields that can be added.
   *
   * Use [godot.ProjectSettings.globalizePath] to convert a `res://` or `user://` path into a system path for use with this method.
   *
   * **Note:** Use [godot.String.uriEncode] to encode characters within URLs in a URL-safe, portable way. This is especially required for line breaks. Otherwise, [shellOpen] may not work correctly in a project exported to the Web platform.
   *
   * **Note:** This method is implemented on Android, iOS, Web, Linux, macOS and Windows.
   */
  public fun shellOpen(uri: String): GodotError {
    TransferContext.writeArguments(STRING to uri)
    TransferContext.callMethod(rawPtr, MethodBindings.shellOpenPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Requests the OS to open the file manager, then navigate to the given [fileOrDirPath] and select the target file or folder.
   *
   * If [fileOrDirPath] is a valid directory path, and [openFolder] is `true`, the method will open the file manager and enter the target folder without selecting anything.
   *
   * Use [godot.ProjectSettings.globalizePath] to convert a `res://` or `user://` path into a system path for use with this method.
   *
   * **Note:** Currently this method is only implemented on Windows and macOS. On other platforms, it will fallback to [shellOpen] with a directory path of [fileOrDirPath] with prefix `file://`.
   */
  @JvmOverloads
  public fun shellShowInFileManager(fileOrDirPath: String, openFolder: Boolean = true): GodotError {
    TransferContext.writeArguments(STRING to fileOrDirPath, BOOL to openFolder)
    TransferContext.callMethod(rawPtr, MethodBindings.shellShowInFileManagerPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if the child process ID ([pid]) is still running or `false` if it has terminated.
   *
   * Must be a valid ID generated from [createProcess].
   *
   * **Note:** This method is implemented on Android, iOS, Linux, macOS and Windows.
   */
  public fun isProcessRunning(pid: Int): Boolean {
    TransferContext.writeArguments(LONG to pid.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isProcessRunningPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the project's process ID.
   *
   * **Note:** This method is implemented on Android, iOS, Linux, macOS and Windows.
   */
  public fun getProcessId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getProcessIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns `true` if the environment variable with the name [variable] exists.
   *
   * **Note:** Double-check the casing of [variable]. Environment variable names are case-sensitive on all platforms except Windows.
   */
  public fun hasEnvironment(variable: String): Boolean {
    TransferContext.writeArguments(STRING to variable)
    TransferContext.callMethod(rawPtr, MethodBindings.hasEnvironmentPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the value of an environment variable. Returns an empty string if the environment variable doesn't exist.
   *
   * **Note:** Double-check the casing of [variable]. Environment variable names are case-sensitive on all platforms except Windows.
   */
  public fun getEnvironment(variable: String): String {
    TransferContext.writeArguments(STRING to variable)
    TransferContext.callMethod(rawPtr, MethodBindings.getEnvironmentPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Sets the value of the environment variable [variable] to [value]. The environment variable will be set for the Godot process and any process executed with [execute] after running [setEnvironment]. The environment variable will *not* persist to processes run after the Godot process was terminated.
   *
   * **Note:** Environment variable names are case-sensitive on all platforms except Windows. The [variable] name cannot be empty or include the `=` character. On Windows, there is a 32767 characters limit for the combined length of [variable], [value], and the `=` and null terminator characters that will be registered in the environment block.
   */
  public fun setEnvironment(variable: String, `value`: String): Unit {
    TransferContext.writeArguments(STRING to variable, STRING to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setEnvironmentPtr, NIL)
  }

  /**
   * Removes the environment [variable] from the current environment, if it exists. The environment variable will be removed for the Godot process and any process executed with [execute] after running [unsetEnvironment]. The removal of the environment variable will *not* persist to processes run after the Godot process was terminated.
   *
   * **Note:** Environment variable names are case-sensitive on all platforms except Windows. The [variable] name cannot be empty or include the `=` character.
   */
  public fun unsetEnvironment(variable: String): Unit {
    TransferContext.writeArguments(STRING to variable)
    TransferContext.callMethod(rawPtr, MethodBindings.unsetEnvironmentPtr, NIL)
  }

  /**
   * Returns the name of the host OS.
   *
   * On Windows, this is `"Windows"`.
   *
   * On macOS, this is `"macOS"`.
   *
   * On Linux-based operating systems, this is `"Linux"`.
   *
   * On BSD-based operating systems, this is `"FreeBSD"`, `"NetBSD"`, `"OpenBSD"`, or `"BSD"` as a fallback.
   *
   * On Android, this is `"Android"`.
   *
   * On iOS, this is `"iOS"`.
   *
   * On the web, this is `"Web"`.
   *
   * **Note:** Custom builds of the engine may support additional platforms, such as consoles, yielding other return values.
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * match OS.get_name():
   *
   *     "Windows":
   *
   *         print("Windows")
   *
   *     "macOS":
   *
   *         print("macOS")
   *
   *     "Linux", "FreeBSD", "NetBSD", "OpenBSD", "BSD":
   *
   *         print("Linux/BSD")
   *
   *     "Android":
   *
   *         print("Android")
   *
   *     "iOS":
   *
   *         print("iOS")
   *
   *     "Web":
   *
   *         print("Web")
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * switch (OS.GetName())
   *
   * {
   *
   *     case "Windows":
   *
   *         GD.Print("Windows");
   *
   *         break;
   *
   *     case "macOS":
   *
   *         GD.Print("macOS");
   *
   *         break;
   *
   *     case "Linux":
   *
   *     case "FreeBSD":
   *
   *     case "NetBSD":
   *
   *     case "OpenBSD":
   *
   *     case "BSD":
   *
   *         GD.Print("Linux/BSD");
   *
   *         break;
   *
   *     case "Android":
   *
   *         GD.Print("Android");
   *
   *         break;
   *
   *     case "iOS":
   *
   *         GD.Print("iOS");
   *
   *         break;
   *
   *     case "Web":
   *
   *         GD.Print("Web");
   *
   *         break;
   *
   * }
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public fun getName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the name of the distribution for Linux and BSD platforms (e.g. Ubuntu, Manjaro, OpenBSD, etc.).
   *
   * Returns the same value as [getName] for stock Android ROMs, but attempts to return the custom ROM name for popular Android derivatives such as LineageOS.
   *
   * Returns the same value as [getName] for other platforms.
   *
   * **Note:** This method is not supported on the web platform. It returns an empty string.
   */
  public fun getDistributionName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDistributionNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the exact production and build version of the operating system. This is different from the branded version used in marketing. This helps to distinguish between different releases of operating systems, including minor versions, and insider and custom builds.
   *
   * For Windows, the major and minor version are returned, as well as the build number. For example, the returned string can look like `10.0.9926` for a build of Windows 10, and it can look like `6.1.7601` for a build of Windows 7 SP1.
   *
   * For rolling distributions, such as Arch Linux, an empty string is returned.
   *
   * For macOS and iOS, the major and minor version are returned, as well as the patch number.
   *
   * For Android, the SDK version and the incremental build number are returned. If it's a custom ROM, it attempts to return its version instead.
   *
   * **Note:** This method is not supported on the web platform. It returns an empty string.
   */
  public fun getVersion(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVersionPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the command-line arguments passed to the engine.
   *
   * Command-line arguments can be written in any form, including both `--key value` and `--key=value` forms so they can be properly parsed, as long as custom command-line arguments do not conflict with engine arguments.
   *
   * You can also incorporate environment variables using the [getEnvironment] method.
   *
   * You can set [godot.ProjectSettings.editor/run/mainRunArgs] to define command-line arguments to be passed by the editor when running the project.
   *
   * Here's a minimal example on how to parse command-line arguments into a dictionary using the `--key=value` form for arguments:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var arguments = {}
   *
   * for argument in OS.get_cmdline_args():
   *
   *     if argument.find("=") > -1:
   *
   *         var key_value = argument.split("=")
   *
   *         arguments[key_value[0].lstrip("--")] = key_value[1]
   *
   *     else:
   *
   *         # Options without an argument will be present in the dictionary,
   *
   *         # with the value set to an empty string.
   *
   *         arguments[argument.lstrip("--")] = ""
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * var arguments = new Godot.Collections.Dictionary();
   *
   * foreach (var argument in OS.GetCmdlineArgs())
   *
   * {
   *
   *     if (argument.Find("=") > -1)
   *
   *     {
   *
   *         string[] keyValue = argument.Split("=");
   *
   *         arguments[keyValue[0].LStrip("--")] = keyValue[1];
   *
   *     }
   *
   *     else
   *
   *     {
   *
   *         // Options without an argument will be present in the dictionary,
   *
   *         // with the value set to an empty string.
   *
   *         arguments[keyValue[0].LStrip("--")] = "";
   *
   *     }
   *
   * }
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * **Note:** Passing custom user arguments directly is not recommended, as the engine may discard or modify them. Instead, the best way is to use the standard UNIX double dash (`--`) and then pass custom arguments, which the engine itself will ignore. These can be read via [getCmdlineUserArgs].
   */
  public fun getCmdlineArgs(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCmdlineArgsPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Similar to [getCmdlineArgs], but this returns the user arguments (any argument passed after the double dash `--` or double plus `++` argument). These are left untouched by Godot for the user. `++` can be used in situations where `--` is intercepted by another program (such as `startx`).
   *
   * For example, in the command line below, `--fullscreen` will not be returned in [getCmdlineUserArgs] and `--level 1` will only be returned in [getCmdlineUserArgs]:
   *
   * ```
   * 				godot --fullscreen -- --level 1
   * 				# Or:
   * 				godot --fullscreen ++ --level 1
   * 				```
   */
  public fun getCmdlineUserArgs(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCmdlineUserArgsPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Returns the video adapter driver name and version for the user's currently active graphics card. See also [godot.RenderingServer.getVideoAdapterApiVersion].
   *
   * The first element holds the driver name, such as `nvidia`, `amdgpu`, etc.
   *
   * The second element holds the driver version. For e.g. the `nvidia` driver on a Linux/BSD platform, the version is in the format `510.85.02`. For Windows, the driver's format is `31.0.15.1659`.
   *
   * **Note:** This method is only supported on the platforms Linux/BSD and Windows when not running in headless mode. It returns an empty array on other platforms.
   */
  public fun getVideoAdapterDriverInfo(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVideoAdapterDriverInfoPtr,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * If [restart] is `true`, restarts the project automatically when it is exited with [godot.SceneTree.quit] or [godot.Node.NOTIFICATION_WM_CLOSE_REQUEST]. Command line [arguments] can be supplied. To restart the project with the same command line arguments as originally used to run the project, pass [getCmdlineArgs] as the value for [arguments].
   *
   * [setRestartOnExit] can be used to apply setting changes that require a restart. See also [isRestartOnExitSet] and [getRestartOnExitArguments].
   *
   * **Note:** This method is only effective on desktop platforms, and only when the project isn't started from the editor. It will have no effect on mobile and Web platforms, or when the project is started from the editor.
   *
   * **Note:** If the project process crashes or is *killed* by the user (by sending `SIGKILL` instead of the usual `SIGTERM`), the project won't restart automatically.
   */
  @JvmOverloads
  public fun setRestartOnExit(restart: Boolean, arguments: PackedStringArray = PackedStringArray()):
      Unit {
    TransferContext.writeArguments(BOOL to restart, PACKED_STRING_ARRAY to arguments)
    TransferContext.callMethod(rawPtr, MethodBindings.setRestartOnExitPtr, NIL)
  }

  /**
   * Returns `true` if the project will automatically restart when it exits for any reason, `false` otherwise. See also [setRestartOnExit] and [getRestartOnExitArguments].
   */
  public fun isRestartOnExitSet(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isRestartOnExitSetPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the list of command line arguments that will be used when the project automatically restarts using [setRestartOnExit]. See also [isRestartOnExitSet].
   */
  public fun getRestartOnExitArguments(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRestartOnExitArgumentsPtr,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Delays execution of the current thread by [usec] microseconds. [usec] must be greater than or equal to `0`. Otherwise, [delayUsec] will do nothing and will print an error message.
   *
   * **Note:** [delayUsec] is a *blocking* way to delay code execution. To delay code execution in a non-blocking way, see [godot.SceneTree.createTimer]. Awaiting with [godot.SceneTree.createTimer] will delay the execution of code placed below the `await` without affecting the rest of the project (or editor, for [godot.EditorPlugin]s and [godot.EditorScript]s).
   *
   * **Note:** When [delayUsec] is called on the main thread, it will freeze the project and will prevent it from redrawing and registering input until the delay has passed. When using [delayUsec] as part of an [godot.EditorPlugin] or [godot.EditorScript], it will freeze the editor but won't freeze the project if it is currently running (since the project is an independent child process).
   */
  public fun delayUsec(usec: Int): Unit {
    TransferContext.writeArguments(LONG to usec.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.delayUsecPtr, NIL)
  }

  /**
   * Delays execution of the current thread by [msec] milliseconds. [msec] must be greater than or equal to `0`. Otherwise, [delayMsec] will do nothing and will print an error message.
   *
   * **Note:** [delayMsec] is a *blocking* way to delay code execution. To delay code execution in a non-blocking way, see [godot.SceneTree.createTimer]. Awaiting with [godot.SceneTree.createTimer] will delay the execution of code placed below the `await` without affecting the rest of the project (or editor, for [godot.EditorPlugin]s and [godot.EditorScript]s).
   *
   * **Note:** When [delayMsec] is called on the main thread, it will freeze the project and will prevent it from redrawing and registering input until the delay has passed. When using [delayMsec] as part of an [godot.EditorPlugin] or [godot.EditorScript], it will freeze the editor but won't freeze the project if it is currently running (since the project is an independent child process).
   */
  public fun delayMsec(msec: Int): Unit {
    TransferContext.writeArguments(LONG to msec.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.delayMsecPtr, NIL)
  }

  /**
   * Returns the host OS locale as a string of the form `language_Script_COUNTRY_VARIANT@extra`. If you want only the language code and not the fully specified locale from the OS, you can use [getLocaleLanguage].
   *
   * `language` - 2 or 3-letter [language code](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes), in lower case.
   *
   * [code skip-lint]Script` - optional, 4-letter [script code](https://en.wikipedia.org/wiki/ISO_15924), in title case.
   *
   * `COUNTRY` - optional, 2 or 3-letter [country code](https://en.wikipedia.org/wiki/ISO_3166-1), in upper case.
   *
   * `VARIANT` - optional, language variant, region and sort order. Variant can have any number of underscored keywords.
   *
   * `extra` - optional, semicolon separated list of additional key words. Currency, calendar, sort order and numbering system information.
   */
  public fun getLocale(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLocalePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the host OS locale's 2 or 3-letter [language code](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) as a string which should be consistent on all platforms. This is equivalent to extracting the `language` part of the [getLocale] string.
   *
   * This can be used to narrow down fully specified locale strings to only the "common" language code, when you don't need the additional information about country code or variants. For example, for a French Canadian user with `fr_CA` locale, this would return `fr`.
   */
  public fun getLocaleLanguage(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLocaleLanguagePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the model name of the current device.
   *
   * **Note:** This method is implemented on Android and iOS. Returns `"GenericDevice"` on unsupported platforms.
   */
  public fun getModelName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getModelNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * If `true`, the `user://` file system is persistent, so that its state is the same after a player quits and starts the game again. Relevant to the Web platform, where this persistence may be unavailable.
   */
  public fun isUserfsPersistent(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isUserfsPersistentPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the engine was executed with the `--verbose` or `-v` command line argument, or if [godot.ProjectSettings.debug/settings/stdout/verboseStdout] is `true`. See also [@GlobalScope.printVerbose].
   */
  public fun isStdoutVerbose(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isStdoutVerbosePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the Godot binary used to run the project is a *debug* export template, or when running in the editor.
   *
   * Returns `false` if the Godot binary used to run the project is a *release* export template.
   *
   * To check whether the Godot binary used to run the project is an export template (debug or release), use `OS.has_feature("template")` instead.
   */
  public fun isDebugBuild(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isDebugBuildPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the amount of static memory being used by the program in bytes (only works in debug).
   */
  public fun getStaticMemoryUsage(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStaticMemoryUsagePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns the maximum amount of static memory used (only works in debug).
   */
  public fun getStaticMemoryPeakUsage(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStaticMemoryPeakUsagePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns the [godot.core.Dictionary] with the following keys:
   *
   * `"physical"` - total amount of usable physical memory, in bytes or `-1` if unknown. This value can be slightly less than the actual physical memory amount, since it does not include memory reserved by kernel and devices.
   *
   * `"free"` - amount of physical memory, that can be immediately allocated without disk access or other costly operation, in bytes or `-1` if unknown. The process might be able to allocate more physical memory, but such allocation will require moving inactive pages to disk and can take some time.
   *
   * `"available"` - amount of memory, that can be allocated without extending the swap file(s), in bytes or `-1` if unknown. This value include both physical memory and swap.
   *
   * `"stack"` - size of the current thread stack, in bytes or `-1` if unknown.
   */
  public fun getMemoryInfo(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMemoryInfoPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Moves the file or directory to the system's recycle bin. See also [godot.DirAccess.remove].
   *
   * The method takes only global paths, so you may need to use [godot.ProjectSettings.globalizePath]. Do not use it for files in `res://` as it will not work in exported projects.
   *
   * **Note:** If the user has disabled the recycle bin on their system, the file will be permanently deleted instead.
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var file_to_remove = "user://slot1.save"
   *
   * OS.move_to_trash(ProjectSettings.globalize_path(file_to_remove))
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * var fileToRemove = "user://slot1.save";
   *
   * OS.MoveToTrash(ProjectSettings.GlobalizePath(fileToRemove));
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public fun moveToTrash(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.moveToTrashPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the absolute directory path where user data is written (`user://`).
   *
   * On Windows, this is `%AppData%\Godot\app_userdata\[project_name]`, or `%AppData%\[custom_name]` if `use_custom_user_dir` is set. `%AppData%` expands to `%UserProfile%\AppData\Roaming`.
   *
   * On macOS, this is `~/Library/Application Support/Godot/app_userdata/[project_name]`, or `~/Library/Application Support/[custom_name]` if `use_custom_user_dir` is set.
   *
   * On Linux and BSD, this is `~/.local/share/godot/app_userdata/[project_name]`, or `~/.local/share/[custom_name]` if `use_custom_user_dir` is set.
   *
   * On Android and iOS, this is a sandboxed directory in either internal or external storage, depending on the user's configuration.
   *
   * On the web, this is a virtual directory managed by the browser.
   *
   * If the project name is empty, `[project_name]` falls back to `[unnamed project]`.
   *
   * Not to be confused with [getDataDir], which returns the *global* (non-project-specific) user home directory.
   */
  public fun getUserDataDir(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getUserDataDirPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the actual path to commonly used folders across different platforms. Available locations are specified in [enum SystemDir].
   *
   * **Note:** This method is implemented on Android, Linux, macOS and Windows.
   *
   * **Note:** Shared storage is implemented on Android and allows to differentiate between app specific and shared directories. Shared directories have additional restrictions on Android.
   */
  @JvmOverloads
  public fun getSystemDir(dir: SystemDir, sharedStorage: Boolean = true): String {
    TransferContext.writeArguments(LONG to dir.id, BOOL to sharedStorage)
    TransferContext.callMethod(rawPtr, MethodBindings.getSystemDirPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the *global* user configuration directory according to the operating system's standards. On the Linux/BSD platform, this path can be overridden by setting the `XDG_CONFIG_HOME` environment variable before starting the project. See [godot.File paths in Godot projects]($DOCS_URL/tutorials/io/data_paths.html) in the documentation for more information. See also [getCacheDir] and [getDataDir].
   *
   * Not to be confused with [getUserDataDir], which returns the *project-specific* user data path.
   */
  public fun getConfigDir(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConfigDirPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the *global* user data directory according to the operating system's standards. On the Linux/BSD platform, this path can be overridden by setting the `XDG_DATA_HOME` environment variable before starting the project. See [godot.File paths in Godot projects]($DOCS_URL/tutorials/io/data_paths.html) in the documentation for more information. See also [getCacheDir] and [getConfigDir].
   *
   * Not to be confused with [getUserDataDir], which returns the *project-specific* user data path.
   */
  public fun getDataDir(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDataDirPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the *global* cache data directory according to the operating system's standards. On the Linux/BSD platform, this path can be overridden by setting the `XDG_CACHE_HOME` environment variable before starting the project. See [godot.File paths in Godot projects]($DOCS_URL/tutorials/io/data_paths.html) in the documentation for more information. See also [getConfigDir] and [getDataDir].
   *
   * Not to be confused with [getUserDataDir], which returns the *project-specific* user data path.
   */
  public fun getCacheDir(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCacheDirPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns a string that is unique to the device.
   *
   * **Note:** This string may change without notice if the user reinstalls/upgrades their operating system or changes their hardware. This means it should generally not be used to encrypt persistent data as the data saved before an unexpected ID change would become inaccessible. The returned string may also be falsified using external programs, so do not rely on the string returned by [getUniqueId] for security purposes.
   *
   * **Note:** Returns an empty string and prints an error on Web, as this method cannot be implemented on this platform.
   */
  public fun getUniqueId(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getUniqueIdPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the given keycode as a string (e.g. Return values: `"Escape"`, `"Shift+Escape"`).
   *
   * See also [godot.InputEventKey.keycode] and [godot.InputEventKey.getKeycodeWithModifiers].
   */
  public fun getKeycodeString(code: Key): String {
    TransferContext.writeArguments(LONG to code.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getKeycodeStringPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns `true` if the input keycode corresponds to a Unicode character.
   */
  public fun isKeycodeUnicode(code: Long): Boolean {
    TransferContext.writeArguments(LONG to code)
    TransferContext.callMethod(rawPtr, MethodBindings.isKeycodeUnicodePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the keycode of the given string (e.g. "Escape").
   */
  public fun findKeycodeFromString(string: String): Key {
    TransferContext.writeArguments(STRING to string)
    TransferContext.callMethod(rawPtr, MethodBindings.findKeycodeFromStringPtr, LONG)
    return Key.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Enables backup saves if [enabled] is `true`.
   */
  public fun setUseFileAccessSaveAndSwap(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setUseFileAccessSaveAndSwapPtr, NIL)
  }

  /**
   * Sets the name of the current thread.
   */
  public fun setThreadName(name: String): GodotError {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setThreadNamePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the ID of the current thread. This can be used in logs to ease debugging of multi-threaded applications.
   *
   * **Note:** Thread IDs are not deterministic and may be reused across application restarts.
   */
  public fun getThreadCallerId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getThreadCallerIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns the ID of the main thread. See [getThreadCallerId].
   *
   * **Note:** Thread IDs are not deterministic and may be reused across application restarts.
   */
  public fun getMainThreadId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMainThreadIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns `true` if the feature for the given feature tag is supported in the currently running instance, depending on the platform, build, etc. Can be used to check whether you're currently running a debug build, on a certain platform or arch, etc. Refer to the [godot.Feature Tags]($DOCS_URL/tutorials/export/feature_tags.html) documentation for more details.
   *
   * **Note:** Tag names are case-sensitive.
   *
   * **Note:** On the web platform, one of the following additional tags is defined to indicate host platform: `web_android`, `web_ios`, `web_linuxbsd`, `web_macos`, or `web_windows`.
   *
   * **Note:** On the iOS simulator, the additional `simulator` tag is defined.
   */
  public fun hasFeature(tagName: String): Boolean {
    TransferContext.writeArguments(STRING to tagName)
    TransferContext.callMethod(rawPtr, MethodBindings.hasFeaturePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if application is running in the sandbox.
   *
   * **Note:** This method is implemented on macOS and Linux.
   */
  public fun isSandboxed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isSandboxedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * At the moment this function is only used by `AudioDriverOpenSL` to request permission for `RECORD_AUDIO` on Android.
   */
  public fun requestPermission(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.requestPermissionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * With this function, you can request dangerous permissions since normal permissions are automatically granted at install time in Android applications.
   *
   * **Note:** This method is implemented only on Android.
   */
  public fun requestPermissions(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.requestPermissionsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * On Android devices: With this function, you can get the list of dangerous permissions that have been granted.
   *
   * On macOS (sandboxed applications only): This function returns the list of user selected folders accessible to the application. Use native file dialog to request folder access permission.
   */
  public fun getGrantedPermissions(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGrantedPermissionsPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * On macOS (sandboxed applications only), this function clears list of user selected folders accessible to the application.
   */
  public fun revokeGrantedPermissions(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.revokeGrantedPermissionsPtr, NIL)
  }

  public enum class RenderingDriver(
    id: Long,
  ) {
    /**
     * The Vulkan rendering driver. It requires Vulkan 1.0 support and automatically uses features from Vulkan 1.1 and 1.2 if available.
     */
    RENDERING_DRIVER_VULKAN(0),
    /**
     * The OpenGL 3 rendering driver. It uses OpenGL 3.3 Core Profile on desktop platforms, OpenGL ES 3.0 on mobile devices, and WebGL 2.0 on Web.
     */
    RENDERING_DRIVER_OPENGL3(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class SystemDir(
    id: Long,
  ) {
    /**
     * Desktop directory path.
     */
    SYSTEM_DIR_DESKTOP(0),
    /**
     * DCIM (Digital Camera Images) directory path.
     */
    SYSTEM_DIR_DCIM(1),
    /**
     * Documents directory path.
     */
    SYSTEM_DIR_DOCUMENTS(2),
    /**
     * Downloads directory path.
     */
    SYSTEM_DIR_DOWNLOADS(3),
    /**
     * Movies directory path.
     */
    SYSTEM_DIR_MOVIES(4),
    /**
     * Music directory path.
     */
    SYSTEM_DIR_MUSIC(5),
    /**
     * Pictures directory path.
     */
    SYSTEM_DIR_PICTURES(6),
    /**
     * Ringtones directory path.
     */
    SYSTEM_DIR_RINGTONES(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  internal object MethodBindings {
    public val getConnectedMidiInputsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_connected_midi_inputs")

    public val openMidiInputsPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "open_midi_inputs")

    public val closeMidiInputsPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "close_midi_inputs")

    public val alertPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "alert")

    public val crashPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "crash")

    public val setLowProcessorUsageModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "set_low_processor_usage_mode")

    public val isInLowProcessorUsageModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "is_in_low_processor_usage_mode")

    public val setLowProcessorUsageModeSleepUsecPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "set_low_processor_usage_mode_sleep_usec")

    public val getLowProcessorUsageModeSleepUsecPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_low_processor_usage_mode_sleep_usec")

    public val setDeltaSmoothingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "set_delta_smoothing")

    public val isDeltaSmoothingEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "is_delta_smoothing_enabled")

    public val getProcessorCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_processor_count")

    public val getProcessorNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_processor_name")

    public val getSystemFontsPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "get_system_fonts")

    public val getSystemFontPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_system_font_path")

    public val getSystemFontPathForTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_system_font_path_for_text")

    public val getExecutablePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_executable_path")

    public val readStringFromStdinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "read_string_from_stdin")

    public val executePtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "execute")

    public val createProcessPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "create_process")

    public val createInstancePtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "create_instance")

    public val killPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "kill")

    public val shellOpenPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "shell_open")

    public val shellShowInFileManagerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "shell_show_in_file_manager")

    public val isProcessRunningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "is_process_running")

    public val getProcessIdPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "get_process_id")

    public val hasEnvironmentPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "has_environment")

    public val getEnvironmentPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "get_environment")

    public val setEnvironmentPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "set_environment")

    public val unsetEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "unset_environment")

    public val getNamePtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "get_name")

    public val getDistributionNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_distribution_name")

    public val getVersionPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "get_version")

    public val getCmdlineArgsPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "get_cmdline_args")

    public val getCmdlineUserArgsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_cmdline_user_args")

    public val getVideoAdapterDriverInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_video_adapter_driver_info")

    public val setRestartOnExitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "set_restart_on_exit")

    public val isRestartOnExitSetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "is_restart_on_exit_set")

    public val getRestartOnExitArgumentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_restart_on_exit_arguments")

    public val delayUsecPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "delay_usec")

    public val delayMsecPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "delay_msec")

    public val getLocalePtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "get_locale")

    public val getLocaleLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_locale_language")

    public val getModelNamePtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "get_model_name")

    public val isUserfsPersistentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "is_userfs_persistent")

    public val isStdoutVerbosePtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "is_stdout_verbose")

    public val isDebugBuildPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "is_debug_build")

    public val getStaticMemoryUsagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_static_memory_usage")

    public val getStaticMemoryPeakUsagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_static_memory_peak_usage")

    public val getMemoryInfoPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "get_memory_info")

    public val moveToTrashPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "move_to_trash")

    public val getUserDataDirPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "get_user_data_dir")

    public val getSystemDirPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "get_system_dir")

    public val getConfigDirPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "get_config_dir")

    public val getDataDirPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "get_data_dir")

    public val getCacheDirPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "get_cache_dir")

    public val getUniqueIdPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "get_unique_id")

    public val getKeycodeStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_keycode_string")

    public val isKeycodeUnicodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "is_keycode_unicode")

    public val findKeycodeFromStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "find_keycode_from_string")

    public val setUseFileAccessSaveAndSwapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "set_use_file_access_save_and_swap")

    public val setThreadNamePtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "set_thread_name")

    public val getThreadCallerIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_thread_caller_id")

    public val getMainThreadIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_main_thread_id")

    public val hasFeaturePtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "has_feature")

    public val isSandboxedPtr: VoidPtr = TypeManager.getMethodBindPtr("OS", "is_sandboxed")

    public val requestPermissionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "request_permission")

    public val requestPermissionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "request_permissions")

    public val getGrantedPermissionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "get_granted_permissions")

    public val revokeGrantedPermissionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OS", "revoke_granted_permissions")
  }
}
