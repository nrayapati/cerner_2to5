// ➜  go get -u github.com/spf13/cobra/cobra
// ➜  vi go_cobra_cli.go copy below code
// ➜  go build go_cobra_cli.go
// ➜  ./go_cobra_cli
// Usage:
//  app [command]
//
// Available Commands:
//  help        Help about any command
//  print       Print anything to the screen
//
// Flags:
//  -h, --help   help for app
//
// Use "app [command] --help" for more information about a command.
// ➜  ./go_cobra_cli print 'cerner_2^5_2018'
// Print: cerner_2^5_2018
package main

import (
  "fmt"
  "strings"

  "github.com/spf13/cobra"
)

func main() {
  var cmdPrint = &cobra.Command{
    Use:   "print [string to print]",
    Short: "Print anything to the screen",
    Long: `print is for printing anything back to the screen.
For many years people have printed back to the screen.`,
    Args: cobra.MinimumNArgs(1),
    Run: func(cmd *cobra.Command, args []string) {
      fmt.Println("Print: " + strings.Join(args, " "))
    },
  }

  var rootCmd = &cobra.Command{Use: "app"}
  rootCmd.AddCommand(cmdPrint)
  rootCmd.Execute()
}
