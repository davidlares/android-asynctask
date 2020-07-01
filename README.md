# Android AsyncTask Class

The `AsyncTask` tool is a framework used for managing `Threads` and `Handlers` easier. It uses the `AsyncTask` class for that.

This one uses the same objects (low-level) communication for interacting with the main Thread. But, let's you place all the code in the same place.

The `AsyncTask` class expects a typed `Parameter`, `Progress`, and `Result` object. The `Parameter` are the values you pass to the `task`, The `Progress` are the values passed back while the task is executed, something like "check-points" and the `Result` param/object are the value passed back as the result when the process is completed.

Each of the params explained before is referenced during the `doInBackground` method inside the `MyTask.java` class, one key component is the `publishProgress()` method, this one is responsible for Threads communication.

## Background Threads

Any software naturally runs code instructions one at a time, these ones are run in sequence. But modern software has the capability to take advantage of every aspect of the hardware specs, especially CPU's. Actually nowadays any computer without multiple CPUs it's pretty much considered old.

So, getting back to the first idea, once a task or instruction is executed, the CPU can't do anything else, this is called a blocking call.

## Multithreading

This term takes place directly for computers with multiple CPUs (Cores) when the CPU it's able to generate multiple Threads that can be executed concurrently. That's the case for modern Android devices, almost all of them have multiple cores in its configuration.

The main Thread is used for UI related activities, this is mandatory, and another operations are handled or should be done with the help of the threading techniques, this is because the any demanding operation can freeze the UI, the same happens with network-related operations.

## Credits

 - [David E Lares](https://twitter.com/davidlares3)

## License

 - [MIT](https://opensource.org/licenses/MIT)
